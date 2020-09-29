package com.seedq.rest.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.seedq.rest.elastic.model.Customer;


public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

}
