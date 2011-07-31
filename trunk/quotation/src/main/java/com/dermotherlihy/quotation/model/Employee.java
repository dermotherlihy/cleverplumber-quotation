package com.dermotherlihy.quotation.model;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;

@RooJavaBean
@RooToString
@RooEntity
public class Employee {

    @NotNull
    @Size(min = 2, max = 4)
    private String title;

    @NotNull
    @Size(min = 1, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 30)
    private String lastName;

    @NotNull
    @Column(unique = true)
    @Size(min = 1, max = 30)
    private String userName;

    @NotNull
    @Size(min = 1, max = 30)
    private String phoneNumber;

    @NotNull
    @Size(min = 1, max = 30)
    private String password;

    @NotNull
    @Size(min = 1)
    private String authority;
}
