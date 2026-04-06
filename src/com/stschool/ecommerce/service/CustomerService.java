package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public CustomerRepository customerRepository;
    public CustomerService(){
        customerRepository = new CustomerRepository();
    }




    public Customer handleSignup(Customer customer){
        System.out.println("Customer Service: "+customer);

        return customerRepository.addNewCustomer(customer);
    }
    public void displayCustomerInfo(Customer customer){
        System.out.println("ID: "+customer.getId());
        System.out.println("FirstName: "+customer.getFirstName());
        System.out.println("LastName: "+customer.getLastName());
        System.out.println("email: "+customer.getEmail());
        System.out.println("contactNo: "+customer.getContactNo());

    }
    public void displayAllCustomerDetails(Customer[] customers){
        for(Customer customer : customers){
            displayCustomerInfo(customer);
        }
    }
    public Customer[] getAllCustomers(){

        return customerRepository.getAllCustomers();
    }
}
