package com.dermotherlihy.quotation.model;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Customer {

    @NotNull
    @Size(min=1,max = 10)
    private String title;
    
    @Fetch(FetchMode.SELECT)
    @OneToMany(mappedBy="customer")
    private List<Quote> quotes;

    @NotNull
    @Size(min=1, max = 45)
    private String firstName;

    @NotNull
    @Size(min=1, max = 45)
    private String lastName;

    @NotNull
    @Size(min=1, max = 45)
    private String addressLine1;

    @NotNull
    @Size(min=1, max = 45)
    private String addressLine2;

    @NotNull
    @Size(max = 45)
    private String addressLine3;

    @NotNull
    @Size(min=1, max = 15)
    private String postcode;

    @NotNull
    @Size(min=1, max = 20)
    private String phoneNumber;
    
    @NotNull
    @Size(min=1,max = 45)
    private String emailAddress;
    
    public String getFullName(){
    	return firstName + " " + lastName;
    }
    
    public String getDescription(){
    	return firstName + " " + lastName + " " + phoneNumber;
    }
}
