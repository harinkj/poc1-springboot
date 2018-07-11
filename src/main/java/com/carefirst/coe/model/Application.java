package com.carefirst.coe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPLICATIONS")
public class Application {
	
	public Application(String appName, String appDescription, String stakeHolder) {
		super();
		this.appName = appName;
		this.appDescription = appDescription;
		this.stakeHolder = stakeHolder;
	}
	public Application() {
		// TODO Auto-generated constructor stub
	}
	public Application(Long id) {
		super();
		this.id = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="APPNAME")
	private String appName;
	
	@Column(name="APPDESCRIPTION")
	private String appDescription;
	
	@Column(name="STAKEHOLDER")
	private String stakeHolder;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppDescription() {
		return appDescription;
	}
	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}
	public String getStakeHolder() {
		return stakeHolder;
	}
	public void setStakeHolder(String stakeHolder) {
		this.stakeHolder = stakeHolder;
	}

	

}
