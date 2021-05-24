package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService 
{
    @Autowired
    CustomerDAO customerDAO;

    public void save() {
        
        System.out.println("CustomerService save method...");
        customerDAO.save();
        
    }
        
}
