package com.karaca.daysofcalculator.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserRole {
    USER("USER"),
    MANAGER("MANAGER");

    private final String role;

    ApplicationUserRole(String permissions){
        this.role = permissions;
    }

    public String getRole(){
        return "ROLE_"+role;
    }
}