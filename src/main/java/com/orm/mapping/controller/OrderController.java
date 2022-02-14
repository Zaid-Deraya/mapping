package com.orm.mapping.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orm.mapping.dto.OrderRequest;
import com.orm.mapping.dto.OrderResponse;
import com.orm.mapping.entities.Customer;
import com.orm.mapping.repository.CustomerRepository;
import com.orm.mapping.repository.ProductRepository;


@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());

	}
	
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}
	
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinInformation();
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		return customerRepository.findById(id);
	}
	

}
