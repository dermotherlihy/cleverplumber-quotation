package com.dermotherlihy.quotation.model.testdata;

import org.apache.commons.lang.RandomStringUtils;

import com.dermotherlihy.quotation.model.Comment;
import com.dermotherlihy.quotation.model.Quote;

public class CommentTestData {

	public static Comment createRandomComment(Quote quote){
		Comment comment = new Comment(); 
		comment.setText(RandomStringUtils.randomAlphabetic(20));
		comment.setQuote(quote);
		return comment;
	}
}
