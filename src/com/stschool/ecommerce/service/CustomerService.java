package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistException;
import com.stschool.ecommerce.exception.CustomerNotFound;
import com.stschool.ecommerce.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer) throws CustomerExistException;
    Customer getByPhoneNumber(String phoneNumber) throws CustomerNotFound;
    List<Customer> getAllCustomer();
    Customer update(String phoneNumber, Customer customer) throws CustomerNotFound;
    void delete(String phoneNumber) throws CustomerNotFound;
    //Customer update(int id, Customer customer)throws CustomerNotFound;
}
