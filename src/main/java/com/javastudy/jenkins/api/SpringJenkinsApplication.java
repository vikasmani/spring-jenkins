package com.javastudy.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application is executing.");
	}
	

	public static void main(String[] args) {
		
		logger.info("Application is executed.");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
