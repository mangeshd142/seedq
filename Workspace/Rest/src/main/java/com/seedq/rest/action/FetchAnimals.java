package com.seedq.rest.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.seedq.rest.bean.AnimalBean;
import com.seedq.restinterface.action.FetchAnimalsInterface;
import com.seedq.restinterface.bean.CommonInterface;

@Component
public class FetchAnimals implements FetchAnimalsInterface{

	@Override
	public List<CommonInterface> execute() {
		List<CommonInterface> animals = new ArrayList<CommonInterface>();
		animals.add(new AnimalBean("Dog","Barak","4"));
		animals.add(new AnimalBean("Cat","Mew","4"));
		animals.add(new AnimalBean("tiger","Drrrw","4"));
		
		
		return animals;
	}

}
