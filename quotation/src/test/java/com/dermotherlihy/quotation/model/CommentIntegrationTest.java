package com.dermotherlihy.quotation.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dermotherlihy.quotation.model.testdata.CompanyTestData;
import com.dermotherlihy.quotation.model.testdata.CustomerTestData;
import com.dermotherlihy.quotation.model.testdata.QuoteTestData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "/META-INF/spring/applicationContext.xml" })
@Transactional
public class CommentIntegrationTest {

	
	private Customer customer = null;
	private Company company = null;
	
	@Before
	public void setup(){
		customer = CustomerTestData.createRandomCustomer();
		Customer.entityManager().persist(customer);
		company = CompanyTestData.createRandomCompany();
		Company.entityManager().persist(company);
		
	}
   
	@Test
    public void testCreateComment(){
		
		Quote quote = QuoteTestData.createRandomQuote(customer, company);
		Comment comment = new Comment();
		comment.setQuote(quote);
		comment.setText("Hey Mand!");
		quote.getComments().add(comment);
		Quote.entityManager().persist(quote);
		quote = Quote.findQuote(quote.getId());
		Assert.assertEquals(quote.getComments().size(), 1);
    }
	
	@Test
    public void testDeleteComment(){
		
		Quote quote = QuoteTestData.createRandomQuote(customer, company);
		Comment comment = new Comment();
		comment.setQuote(quote);
		comment.setText("Hey Mand!");
		quote.getComments().add(comment);
		Quote.entityManager().persist(quote);
		Assert.assertEquals(quote.getComments().size(), 1);
		
		Comment storedComment = quote.getComments().iterator().next();
		Comment.entityManager().remove(storedComment);
		
		quote = Quote.findQuote(quote.getId());
		quote.getComments().remove(storedComment);
		Assert.assertEquals(0,quote.getComments().size());
    }
}

