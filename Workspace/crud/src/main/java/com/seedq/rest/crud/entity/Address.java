package com.seedq.rest.crud.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adeId;
    
    protected int number;
    
    protected String street;
    
    protected String city;
     
    protected String province;
    
    protected String zip;
    
    protected String country;

}
