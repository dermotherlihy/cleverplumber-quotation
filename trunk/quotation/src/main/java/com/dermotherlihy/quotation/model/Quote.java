package com.dermotherlihy.quotation.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import com.dermotherlihy.quotation.model.Employee;

@RooJavaBean
@RooToString
@RooEntity
@NamedQuery(name = "Quote.byDate", query = "select q from Quote q where q.createdDate >= ? AND q.createdDate <= ?")
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
	private BigDecimal labour;

	@NotNull
	private BigDecimal materials;

	private BigDecimal vat;

	@Transient
	private BigDecimal vatRate;

	@NotNull
	private BigDecimal total = BigDecimal.ZERO;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "quote")
	@OrderBy("createdDate ASC")
	private Set<Comment> comments = new HashSet<Comment>();

	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Date createdDate = new Date();

	@NotNull
	@Fetch(FetchMode.SELECT)
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee createdBy;

	public void calculateVatAndTotal() {
		vat = labour.add(materials).multiply(vatRate);
		vat = vat.setScale(2, RoundingMode.HALF_UP);
		total = labour.add(materials).add(vat);
		total = total.setScale(2, RoundingMode.HALF_UP);
	}

	public Set<Comment> getComments() {
		return comments;
	}

	@Value("#{'${quote.vatRate}'}")
	public void setVatRate(String rate) {
		this.vatRate = new BigDecimal(rate);
	}
}
