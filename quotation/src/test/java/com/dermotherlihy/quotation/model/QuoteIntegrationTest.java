package com.dermotherlihy.quotation.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
public class QuoteIntegrationTest {

	private Customer customer = null;
	private Company company = null;
	private Employee employee = null;
	
	@Before
	public void setup(){
		customer = CustomerTestData.createRandomCustomer();
		Customer.entityManager().persist(customer);
		company = CompanyTestData.createRandomCompany();
		Company.entityManager().persist(company);
		employee = EmployeeTestData.createRandomEmployee(RandomStringUtils.randomAlphabetic(10));
		Employee.entityManager().persist(employee);
	}
   
	
	@Test
    public void testFetchQuotesByDate(){
		Quote quote = QuoteTestData.createRandomQuote(employee, customer, company);
		Calendar future = Calendar.getInstance();
		future.add(Calendar.MONTH, 1);
		quote.setCreatedDate(future.getTime());
		Quote.entityManager().persist(quote);
		Calendar now = Calendar.getInstance();
		List quotes = Quote.entityManager().createNamedQuery("Quote.byDate").setParameter(1, now.getTime()).setParameter(2, future.getTime()).getResultList();
		Assert.assertEquals(quotes.size(), 1);
    }
	
}
