package com.example.demo.controllers;

import com.example.demo.domains.Customer;
import com.example.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    public void getHoaitri(){
        System.out.println("How many student in your family");
    }
    public void getHoainam(){
        System.out.println("How many student in your family");
    }
    public void getHoaiHan(){
        System.out.println("How many student in your family");
    }
    public void getHoaiCris(){
        System.out.println("How many student in your family");
    }
    @GetMapping("/customer")
    @ResponseBody
    public Customer getAll(Customer customer){
        Customer customer1 = Customer.builder().build();
        Customer customer2 = Customer.builder().build();

        List<Customer> list = new ArrayList<>();

        customer1.setId(111L);
        customer1.setAddress("Giồng Riềng - Kiên Giang");
        customer1.setName("Ho Hoai Tri");
        list.add(customer1);

        customer2.setId(222L);
        customer2.setAddress("Chau Thanh - Kiên Giang");
        customer2.setName("Ho Hoai Nam");
        list.add(customer2);

       // Customer customer3 = customerService.getCustomer();
        //list.add(customer3);

        return customerService.getCustomer();
    }
}
