package com.dermotherlihy.quotation.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Company {
private Long id;
	
	@NotNull
	@Size(min=1, max=45)
	private String name;
	
	@NotNull
	@Size(min=1, max=45)
	private String addressLine1;
	
	
	@Size(min=1, max=45)
	private String addressLine2;
	

	@Size(min=1, max=45)
	private String addressLine3;
	
	@NotNull
	@Size(min=1, max=15)
	private String postcode;
	
	@NotNull
	@Size(min=1, max=20)
	private String phoneNumber;
	
	@NotNull
	@Size(min=1, max=20)
	private String vatNumber;
	
	@NotNull
	@Size(min=1, max=45)
	private String emailAddress;
	
}
