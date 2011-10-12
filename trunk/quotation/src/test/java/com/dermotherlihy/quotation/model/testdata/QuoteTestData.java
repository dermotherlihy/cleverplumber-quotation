package com.dermotherlihy.quotation.model.testdata;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.dermotherlihy.quotation.model.BrochureType;
import com.dermotherlihy.quotation.model.Comment;
import com.dermotherlihy.quotation.model.Company;
import com.dermotherlihy.quotation.model.Customer;
import com.dermotherlihy.quotation.model.Employee;
import com.dermotherlihy.quotation.model.Quote;
import com.dermotherlihy.quotation.model.QuoteType;

public class QuoteTestData {

	
	public static Quote createRandomQuote(Employee employee, Customer customer, Company company){
		Quote quote = new Quote();
		quote.setBrochureType(BrochureType.WORCHESTER_BOILER);
		quote.setCustomer(customer);
		quote.setCompany(company);
		quote.setCreatedBy(employee);
		quote.setCreatedDate(new Date());
		quote.setLabour(new BigDecimal("20.00"));
		quote.setMaterials(new BigDecimal("20.00"));
		quote.setQuoteType(QuoteType.BOILER);
		return quote;
	}
	
	public static Set<Quote> createBeanCollection(){
		Set<Quote> quotes = new HashSet<Quote>();
		Quote quote = new Quote();
		quote.setBrochureType(BrochureType.WORCHESTER_BOILER);
		quote.setCustomer(CustomerTestData.createRandomCustomer());
		quote.setCompany(CompanyTestData.createRandomCompany());
		Set<Comment> comments = new HashSet<Comment>();
		comments.add(CommentTestData.createRandomComment(quote));
		quote.setComments(comments);
		quote.setLabour(new BigDecimal("20.00"));
		quote.setMaterials(new BigDecimal("20.00"));
		quote.setQuoteType(QuoteType.BOILER);
		quotes.add(quote);
		return quotes;
	}
}
