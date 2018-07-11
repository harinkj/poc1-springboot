package com.carefirst.coe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carefirst.coe.model.Application;
import com.carefirst.coe.services.ApplicationService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController()
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/api/{id}")
	public Application findApp(@PathVariable(value="id") Long id) {
		return applicationService.findById(id);
	}
	
	@GetMapping("/api")
	public List<Application> findapps() {
		
		return applicationService.findAll();
		
	}
	
	@PostMapping("/api")
	public Application create(@RequestBody Application application) {
		
		return applicationService.create(application);
	}
	
	@PutMapping("/api")
	public Application update(@RequestBody Application application) {
		
		return applicationService.update(application);
		
	}
	
	  @DeleteMapping("/api/{id}")
	    public Application delete(@PathVariable("id") Long id) {
	         return applicationService.delete(id);
	    }

}
