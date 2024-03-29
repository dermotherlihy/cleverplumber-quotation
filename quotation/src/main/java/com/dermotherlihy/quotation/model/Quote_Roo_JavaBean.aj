// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import com.dermotherlihy.quotation.model.BrochureType;
import com.dermotherlihy.quotation.model.Comment;
import com.dermotherlihy.quotation.model.Company;
import com.dermotherlihy.quotation.model.Customer;
import com.dermotherlihy.quotation.model.Employee;
import com.dermotherlihy.quotation.model.Job;
import com.dermotherlihy.quotation.model.QuoteType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

privileged aspect Quote_Roo_JavaBean {
    
    public Customer Quote.getCustomer() {
        return this.customer;
    }
    
    public void Quote.setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Company Quote.getCompany() {
        return this.company;
    }
    
    public void Quote.setCompany(Company company) {
        this.company = company;
    }
    
    public QuoteType Quote.getQuoteType() {
        return this.quoteType;
    }
    
    public void Quote.setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }
    
    public BrochureType Quote.getBrochureType() {
        return this.brochureType;
    }
    
    public void Quote.setBrochureType(BrochureType brochureType) {
        this.brochureType = brochureType;
    }
    
    public BigDecimal Quote.getLabour() {
        return this.labour;
    }
    
    public void Quote.setLabour(BigDecimal labour) {
        this.labour = labour;
    }
    
    public BigDecimal Quote.getMaterials() {
        return this.materials;
    }
    
    public void Quote.setMaterials(BigDecimal materials) {
        this.materials = materials;
    }
    
    public BigDecimal Quote.getVat() {
        return this.vat;
    }
    
    public void Quote.setVat(BigDecimal vat) {
        this.vat = vat;
    }
    
    public BigDecimal Quote.getVatRate() {
        return this.vatRate;
    }
    
    public void Quote.setVatRate(BigDecimal vatRate) {
        this.vatRate = vatRate;
    }
    
    public BigDecimal Quote.getTotal() {
        return this.total;
    }
    
    public void Quote.setTotal(BigDecimal total) {
        this.total = total;
    }
    
    public void Quote.setComments(Set<Comment> comments) {
        this.comments = comments;
    }
    
    public Date Quote.getCreatedDate() {
        return this.createdDate;
    }
    
    public void Quote.setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public Employee Quote.getCreatedBy() {
        return this.createdBy;
    }
    
    public void Quote.setCreatedBy(Employee createdBy) {
        this.createdBy = createdBy;
    }
    
    public Job Quote.getJob() {
        return this.job;
    }
    
    public void Quote.setJob(Job job) {
        this.job = job;
    }
    
}
