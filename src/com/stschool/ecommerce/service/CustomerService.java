package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public Customer handleSignup(Customer customer){
        System.out.println("Customer Service: "+customer);
        CustomerRepository customerRepository = new CustomerRepository();
        return customerRepository.addNewCustomer(customer);
    }
    public void displayCustomerInfo(Customer customer){
        System.out.println("ID: "+customer.getId());
        System.out.println("FirstName: "+customer.getFirstName());
        System.out.println("LastName: "+customer.getLastName());
        System.out.println("email: "+customer.getEmail());
        System.out.println("contactNo: "+customer.getContactNo());

    }
}
