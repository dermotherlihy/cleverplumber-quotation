// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import com.dermotherlihy.quotation.model.Quote;
import java.lang.String;
import java.util.Date;

privileged aspect Comment_Roo_JavaBean {
    
    public Quote Comment.getQuote() {
        return this.quote;
    }
    
    public void Comment.setQuote(Quote quote) {
        this.quote = quote;
    }
    
    public String Comment.getText() {
        return this.text;
    }
    
    public void Comment.setText(String text) {
        this.text = text;
    }
    
    public Date Comment.getCreatedDate() {
        return this.createdDate;
    }
    
    public void Comment.setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
}