// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.dermotherlihy.quotation.model;

import java.lang.String;

privileged aspect Comment_Roo_ToString {
    
    public String Comment.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreatedDate: ").append(getCreatedDate()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Quote: ").append(getQuote()).append(", ");
        sb.append("Text: ").append(getText()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
