package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;

public class CustomerController {
    public void handleSignup(Customer customer){
        System.out.println("Handling Signup for : "+customer);
    }
}
