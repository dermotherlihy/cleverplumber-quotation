package com.dermotherlihy.quotation.model;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dermotherlihy.quotation.model.testdata.CompanyTestData;
import com.dermotherlihy.quotation.model.testdata.CustomerTestData;
import com.dermotherlihy.quotation.model.testdata.EmployeeTestData;
import com.dermotherlihy.quotation.model.testdata.QuoteTestData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "/META-INF/spring/applicationContext.xml" })
@Transactional
public class CommentIntegrationTest {

	
	private Customer customer = null;
	private Company company = null;
	private Employee employee = null;
	
	@Before
	public void setup(){
		customer = CustomerTestData.createRandomCustomer();
		Customer.entityManager().persist(customer);
		company = CompanyTestData.createRandomCompany();
		Company.entityManager().persist(company);
		employee = EmployeeTestData.createRandomEmployee(RandomStringUtils.random(12));
		Employee.entityManager().persist(employee);
		
	}
   
	@Test
    public void testCreateComment(){
		
		Quote quote = QuoteTestData.createRandomQuote(employee, customer, company);
		Comment comment = new Comment();
		comment.setText("Hey Mand!");
		quote.getComments().add(comment);
		Quote.entityManager().persist(quote);
		quote = Quote.findQuote(quote.getId());
		Assert.assertEquals(quote.getComments().size(), 1);
    }
	
	@Test
    public void testDeleteComment(){
		
		Quote quote = QuoteTestData.createRandomQuote(employee, customer, company);
		Comment comment = new Comment();
		comment.setText("Hey Mand!");
		quote.getComments().add(comment);
		Quote.entityManager().persist(quote);
		quote.getComments().remove(comment);
		Quote.entityManager().persist(quote);
		Comment.entityManager().remove(comment);
	}
}

