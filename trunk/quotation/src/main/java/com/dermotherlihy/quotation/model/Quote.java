package com.dermotherlihy.quotation.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class Quote {

    @Fetch(FetchMode.SELECT)
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    
    @Fetch(FetchMode.SELECT)
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;


    @NotNull
    @Enumerated
    private QuoteType quoteType;

    @Enumerated
    private BrochureType brochureType;

    @NotNull
    private BigDecimal labourCost;

    @NotNull
    private BigDecimal materialCost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "quote", cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<Comment>();

 
    public Set<Comment> getComments() {
        return comments;
    }
}
