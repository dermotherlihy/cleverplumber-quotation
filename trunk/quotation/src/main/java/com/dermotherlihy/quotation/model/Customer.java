package com.dermotherlihy.quotation.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class Customer {

    @NotNull
    @Size(max = 10)
    private String title;

    @NotNull
    @Size(max = 45)
    private String firstName;

    @NotNull
    @Size(max = 45)
    private String lastName;

    @NotNull
    @Size(max = 45)
    private String addressLine1;

    @NotNull
    @Size(max = 45)
    private String addressLine2;

    @NotNull
    @Size(max = 45)
    private String addressLine3;

    @NotNull
    @Size(max = 15)
    private String postcode;

    @NotNull
    @Size(max = 20)
    private String phoneNumber;
    
    @NotNull
    @Size(max = 45)
    private String emailAddress;
    
    public String getFullName(){
    	return firstName + " " + lastName;
    }
}
