package com.dermotherlihy.quotation.model.testdata;

import java.math.BigDecimal;
import java.util.Set;

import com.dermotherlihy.quotation.model.BrochureType;
import com.dermotherlihy.quotation.model.Comment;
import com.dermotherlihy.quotation.model.Customer;
import com.dermotherlihy.quotation.model.Quote;
import com.dermotherlihy.quotation.model.QuoteType;

public class QuoteTestData {

	
	public static Quote createRandomQuote(Customer customer){
		Quote quote = new Quote();
		quote.setBrochureType(BrochureType.WORCHESTER_BOILER);
		quote.setCustomer(customer);
		quote.setLabourCost(new BigDecimal("20.00"));
		quote.setMaterialCost(new BigDecimal("20.00"));
		quote.setQuoteType(QuoteType.BOILER);
		return quote;
	}
}
