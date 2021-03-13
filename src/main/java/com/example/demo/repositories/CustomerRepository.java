package com.example.demo.repositories;

import com.example.demo.domains.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    public Customer get() {
        Customer customer =  new Customer();
        customer.setId(444L);
        customer.setName("Su ka");
        customer.setAddress("Ngoc Thuan000");

        return customer;
    }
}
