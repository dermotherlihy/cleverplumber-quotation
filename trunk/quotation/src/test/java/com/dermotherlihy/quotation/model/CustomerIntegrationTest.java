package com.dermotherlihy.quotation.model;

import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

import com.dermotherlihy.quotation.model.testdata.CustomerTestData;

@RooIntegrationTest(entity = Customer.class)
public class CustomerIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
   
    
    @Test
    public void testRemove() {
        
    	Customer obj = CustomerTestData.createRandomCustomer();
    	obj.persist();
    	org.junit.Assert.assertNotNull("Data on demand for 'Customer' failed to initialize correctly", obj);
        java.lang.Long id = obj.getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Customer' failed to provide an identifier", id);
        obj = com.dermotherlihy.quotation.model.Customer.findCustomer(id);
        obj.remove();
        obj.flush();
        org.junit.Assert.assertNull("Failed to remove 'Customer' with identifier '" + id + "'", com.dermotherlihy.quotation.model.Customer.findCustomer(id));
    }

}


