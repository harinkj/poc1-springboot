package com.carefirst.coe.services;

import java.util.List;

import com.carefirst.coe.model.Application;

public interface ApplicationService {
	
	Application create(Application application);

	    List<Application> findAll();

	    Application findById(Long id);

	    Application update(Application application);
	    Application delete(Long id);
	
	

}
