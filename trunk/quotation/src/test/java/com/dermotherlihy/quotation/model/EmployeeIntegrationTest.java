package com.dermotherlihy.quotation.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dermotherlihy.quotation.model.testdata.EmployeeTestData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "/META-INF/spring/applicationContext.xml" })
@Transactional
public class EmployeeIntegrationTest {

	private static String username = "employee";
	
	@Test
    public void testCreateEmployee(){
		Employee employee  = EmployeeTestData.createRandomEmployee(username);
		employee.persist();
	}

	

	@Test
    public void testfindEmployeeByUserName(){
		Employee employee  = EmployeeTestData.createRandomEmployee(username);
		employee.persist();
		Employee foundEmployee = (Employee) Employee.entityManager().createNamedQuery("Employee.findByUserName").setParameter(1, username).getSingleResult();
		Assert.assertTrue(foundEmployee.getUsername().equals(username));
		
	}
}
