package com.dermotherlihy.quotation.model.testdata;

import org.apache.commons.lang.RandomStringUtils;

import com.dermotherlihy.quotation.model.Customer;

public class CustomerTestData {

	public static Customer createRandomCustomer(){
		Customer customer = new Customer();
		customer.setAddressLine1(RandomStringUtils.randomAlphabetic(15));
		customer.setAddressLine2(RandomStringUtils.randomAlphabetic(15));
		customer.setAddressLine3(RandomStringUtils.randomAlphabetic(15));
		customer.setPostcode("KT"+RandomStringUtils.randomAlphanumeric(4));
		customer.setTitle("Mr");
		customer.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@"+ RandomStringUtils.randomAlphabetic(4)+".com");			
		customer.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		customer.setFirstName(RandomStringUtils.randomAlphabetic(15));
		customer.setLastName(RandomStringUtils.randomAlphabetic(15));
		return customer;
	}
}
