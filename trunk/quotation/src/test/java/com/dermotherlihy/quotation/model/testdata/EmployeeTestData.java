package com.dermotherlihy.quotation.model.testdata;

import org.apache.commons.lang.RandomStringUtils;

import com.dermotherlihy.quotation.model.Employee;

public class EmployeeTestData {

	public static Employee createRandomEmployee(String username){
		Employee employee = new Employee();
		employee.setFirstName(RandomStringUtils.randomAlphabetic(20));
		employee.setLastName(RandomStringUtils.randomAlphabetic(20));
		employee.setPhoneNumber(RandomStringUtils.randomNumeric(23));
		employee.setTitle("Mr");
		employee.setVersion(1);
		employee.setPassword(RandomStringUtils.randomAlphabetic(20));
		employee.setUsername(username);
		employee.setAuthority("ROLE_USER");
		return employee;
	}
}
