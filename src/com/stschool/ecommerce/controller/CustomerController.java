package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.exception.CustomerExistException;
import com.stschool.ecommerce.exception.CustomerNotFound;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

import java.util.List;

public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    public Customer save(Customer customer) throws CustomerExistException{
        return customerService.save(customer);
    }
    public Customer getByPhoneNumber(String phoneNumber) throws CustomerNotFound {
        return customerService.getByPhoneNumber(phoneNumber);
    }
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    public Customer update(String phoneNumber, Customer customer) throws CustomerNotFound {
        return customerService.update(phoneNumber,customer);
    }
    public void delete(String phoneNumber) throws CustomerNotFound{
        customerService.delete(phoneNumber);
    }

}