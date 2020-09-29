package com.seedq.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seedq.rest.elastic.model.Customer;
import com.seedq.rest.elastic.repository.CustomerRepository;

@RestController
public class TestElasticController {

	@Autowired
	CustomerRepository customerRepository;

	@PostMapping("/save")
	public int saveCustomer(@RequestBody List<Customer> customers) {
		customerRepository.saveAll(customers);

		return customers.size();
	}

	@GetMapping("/find")
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}
}
