package com.seedq.rest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSQLController {
	/*
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/person")
	public List<Person> getAllEmployees() {
		return personRepository.findAll();
	}
	
	@PostMapping("/addPerson")
	public Person createEmployee(@RequestBody Map<String, Object> requestMap) {
		Person person = new Person();
		person.setFirstName((String)requestMap.get("firstName"));
		person.setLastName((String)requestMap.get("lastName"));
		
		Map<String, Object> newM = (Map<String, Object>) requestMap.get("newM");
		
		System.out.println("Address: " +newM.get("adr"));
		System.out.println("Address: " +newM.get("bool"));
		System.out.println("Address: " +newM.get("num"));
		
		return personRepository.save(person);
	}
	
	@PostMapping("/getUser")
	public UserBeanInterface getUser(@RequestBody UserBeanInterface person) {
		
		return person;
	}
	*/
}
