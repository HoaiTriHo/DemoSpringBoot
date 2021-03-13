package com.example.demo.services;

import com.example.demo.domains.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer getCustomer(){
        Customer c = new Customer();
        c.setId(333L);
        c.setName("Mong Van");
        c.setAddress("AN Bien - Kien Giang");
        Customer c1 = customerRepository.get();
        return  c1;
    }
}
