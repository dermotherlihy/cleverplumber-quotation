package com.dermotherlihy.quotation.model;

import java.util.List;

import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Job {

    @Size(max = 45)
    private String addressLine1;

    @Size(max = 45)
    private String addressLine2;

    @Size(max = 45)
    private String addressLine3;

    @Size(max = 15)
    private String postcode;

    @Size(max = 45)
    private String referenceNumber;

    @OneToMany(mappedBy = "job")
    private List<Quote> quotes;

    public void setUpJobDefaults(Customer customer) {
        this.addressLine1 = customer.getAddressLine1();
        this.addressLine2 = customer.getAddressLine2();
        this.addressLine3 = customer.getAddressLine3();
        this.postcode = customer.getPostcode();
    }
}
