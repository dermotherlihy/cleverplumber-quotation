// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import java.lang.String;

privileged aspect Quote_Roo_ToString {
    
    public String Quote.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BrochureType: ").append(getBrochureType()).append(", ");
        sb.append("Comments: ").append(getComments() == null ? "null" : getComments().size()).append(", ");
        sb.append("Customer: ").append(getCustomer()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("LabourCost: ").append(getLabourCost()).append(", ");
        sb.append("MaterialCost: ").append(getMaterialCost()).append(", ");
        sb.append("QuoteType: ").append(getQuoteType()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}