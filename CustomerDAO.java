package com.spring.annotations;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO 
{
    public void save() {
        System.out.println("CustomerDAO save method...");
    }	
}
