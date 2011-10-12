package com.dermotherlihy.quotation.model.testdata;

import org.apache.commons.lang.RandomStringUtils;

import com.dermotherlihy.quotation.model.Company;

public class CompanyTestData {

	
	public static Company createRandomCompany(){
		Company company = new Company();
		company.setName(RandomStringUtils.randomAlphabetic(30));
		company.setVatNumber(RandomStringUtils.randomNumeric(20));
		company.setRegisteredNumber(RandomStringUtils.randomNumeric(20));
		company.setAddressLine1(RandomStringUtils.randomAlphabetic(15));
		company.setAddressLine2(RandomStringUtils.randomAlphabetic(15));
		company.setAddressLine3(RandomStringUtils.randomAlphabetic(15));
		company.setPostcode("KT"+RandomStringUtils.randomAlphanumeric(4));
		company.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@"+ RandomStringUtils.randomAlphabetic(4)+".com");			
		company.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		return company;
	}
}
