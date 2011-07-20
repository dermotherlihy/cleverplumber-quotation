package com.dermotherlihy.quotation.model;

import javax.persistence.ManyToOne;
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
public class Comment {

	
	@Fetch(FetchMode.SELECT)
	@ManyToOne
	private Quote quote;

	@NotNull
	@Size(max = 100)
	private String text;
}
