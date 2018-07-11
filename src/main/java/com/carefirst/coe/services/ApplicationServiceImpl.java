package com.carefirst.coe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carefirst.coe.dao.ApplicationRepository;
import com.carefirst.coe.model.Application;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	@Autowired
	private ApplicationRepository applicationRepository;
	@Override
	public Application create(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}

	

	@Override
	public List<Application> findAll() {
		// TODO Auto-generated method stub
		return applicationRepository.findAll();
	}

	@Override
	public Application findById(Long id) {
		// TODO Auto-generated method stub
		return applicationRepository.getOne(id);
	}

	@Override
	public Application update(Application application) {
		// TODO Auto-generated method stub
		return applicationRepository.save(application);
	}



	@Override
	public Application delete(Long id) {
		
		Application app=applicationRepository.getOne(id);
	applicationRepository.delete(app);
		return app;
		
	}
	
	

}
