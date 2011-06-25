package com.dermotherlihy.quotation.model;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Comment {

	
	@ManyToOne
	@JoinTable(name = "QuoteComment", joinColumns = {@JoinColumn(name="commentId")},
	inverseJoinColumns = {@JoinColumn(name="quoteId")})
	private Quote quote;

	@NotNull
	@Size(max = 100)
	private String text;
}
