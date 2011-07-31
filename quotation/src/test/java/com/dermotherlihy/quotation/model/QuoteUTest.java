package com.dermotherlihy.quotation.model;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class QuoteUTest {

	
	@Test
	public void calcuateVatTest(){
		String rate = "0.175";
		Quote quote = new Quote();
		quote.setLabour(new BigDecimal("20.00"));
		quote.setMaterials(new BigDecimal("30.00"));
		quote.setVatRate(rate);
		quote.calculateVatAndTotal();
		Assert.assertTrue(new BigDecimal("58.75").equals(quote.getTotal()));
	}
}
