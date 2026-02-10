package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {
    public Customer handleSignup(Customer customer){
        System.out.println("Handling Signup for : "+customer);
        CustomerService customerService = new CustomerService();
        return customerService.handleSignup(customer);

    }
}
