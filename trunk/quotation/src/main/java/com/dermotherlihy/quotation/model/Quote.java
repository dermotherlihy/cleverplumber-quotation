package com.dermotherlihy.quotation.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.dermotherlihy.quotation.model.Company;

@RooJavaBean
@RooToString
@RooEntity
public class Quote {

    @Fetch(FetchMode.SELECT)
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @NotNull
    @Enumerated
    private QuoteType quoteType;

    @Enumerated
    private BrochureType brochureType;

    @NotNull
    private BigDecimal labourCost;

    @NotNull
    private BigDecimal materialCost;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "QuoteComment", joinColumns = { @JoinColumn(name = "quoteId", unique = true) }, inverseJoinColumns = { @JoinColumn(name = "commentId") })
    private Set<Comment> comments = new HashSet<Comment>();

    @Fetch(FetchMode.SELECT)
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    public Set<Comment> getComments() {
        return comments;
    }
}
