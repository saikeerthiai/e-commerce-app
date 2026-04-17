package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistException;
import com.stschool.ecommerce.exception.CustomerNotFound;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private  final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) throws CustomerExistException {
        customerRepository.getByPhoneNumber(customer.getPhoneNumber())
                .ifPresent(customer1 -> {
                    throw new CustomerExistException("Customer not Found Exception");
                });
        return customerRepository.save(customer);
    }

    @Override
    public Customer getByPhoneNumber(String phoneNumber) throws CustomerNotFound {
        return customerRepository.getByPhoneNumber(phoneNumber).orElseThrow(()->new CustomerExistException("Customer not Found Exception"+phoneNumber));
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public Customer update(String phoneNumber, Customer customer) throws CustomerNotFound {
          customerRepository.getByPhoneNumber(phoneNumber).orElseThrow(()->new  CustomerExistException("Customer not Found Exception"+phoneNumber));
          return customerRepository.update(phoneNumber,customer);

    }

    @Override
    public void delete(String phoneNumber) throws CustomerNotFound{
        customerRepository.getByPhoneNumber(phoneNumber).orElseThrow(()->new  CustomerExistException("Customer not Found Exception"+phoneNumber));
        customerRepository.delete(phoneNumber);


    }


}
