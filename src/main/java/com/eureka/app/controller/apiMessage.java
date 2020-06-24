package com.eureka.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class apiMessage {

	@Value("${service.instance.name}")
	private String serverInstance;
	
	@RequestMapping("/")
	public String message() {
		return "This is "+ serverInstance;
	}
}
