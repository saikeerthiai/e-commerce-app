package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    /*
  CRUD operation on Products
   */
    private final List<Customer> customers;


    public CustomerRepository() throws IOException {

        CsvParser csvParser = new CsvParser();
        customers = csvParser.getCustomerFromCsv();
    }
   public Customer save(Customer customer){
        this.customers.add(customer);
        return customer;

    }
   public Optional <Customer> getByPhoneNumber(String phoneNumber){
        return customers.stream()
                .filter(customer -> customer.getPhoneNumber().equals(phoneNumber))
                .findFirst();

    }
    public  List<Customer> getAllCustomer(){
        return  this.customers;

    }
//
    public  Customer update(String phoneNumber, Customer customer){
       customers.replaceAll(customer1 -> customer1.getPhoneNumber().equals(phoneNumber)? customer :customer1);
       return customer;

    }
    public  boolean delete(String phoneNumber){
        return customers.removeIf(customer -> customer.getPhoneNumber().equals(phoneNumber));
    }


}
