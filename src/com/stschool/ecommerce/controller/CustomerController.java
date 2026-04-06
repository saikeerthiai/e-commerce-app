package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {
    CustomerService customerService;
    public CustomerController(){
       customerService = new CustomerService();
    }

    public Customer handleSignup(Customer customer){
        System.out.println("Handling Signup for : "+customer);

        return customerService.handleSignup(customer);

    }
    public Customer[] getAllCustomers(){
        return customerService.getAllCustomers();
    }
}
