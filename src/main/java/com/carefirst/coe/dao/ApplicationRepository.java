package com.carefirst.coe.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carefirst.coe.model.Application;
@Transactional
public interface ApplicationRepository extends JpaRepository<Application, Long>{


   

}
