package com.dermotherlihy.quotation.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

@RooJavaBean
@RooToString
@RooEntity
@NamedQuery(name = "Employee.findByUserName", query = "select e from Employee e where e.username = ?")
public class Employee implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 2, max = 4)
	private String title;

	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "firstname")
	private String firstName;

	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "lastname")
	private String lastName;

	@NotNull
	@Column(name = "username", unique = true)
	@Size(min = 1, max = 30)
	private String username;

	@NotNull
	@Size(min = 1, max = 30)
	@Column(name = "phonenumber")
	private String phoneNumber;

	@NotNull
	@Size(min = 1, max = 30)
	private String password;

	@NotNull
	@Size(min = 1)
	private String authority;
	
	@Transient
	private GrantedAuthority grantedAuthority;

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		grantedAuthority = new GrantedAuthorityImpl(authority);
		authorities.add(grantedAuthority);
		return authorities;
	}

	public String getFullName(){
		return firstName + " " + lastName;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
