// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import java.lang.String;

privileged aspect Job_Roo_ToString {
    
    public String Job.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddressLine1: ").append(getAddressLine1()).append(", ");
        sb.append("AddressLine2: ").append(getAddressLine2()).append(", ");
        sb.append("AddressLine3: ").append(getAddressLine3()).append(", ");
        sb.append("Postcode: ").append(getPostcode()).append(", ");
        sb.append("Quotes: ").append(getQuotes() == null ? "null" : getQuotes().size()).append(", ");
        sb.append("ReferenceNumber: ").append(getReferenceNumber());
        return sb.toString();
    }
    
}
