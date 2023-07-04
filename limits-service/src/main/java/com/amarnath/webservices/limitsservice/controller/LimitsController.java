package com.amarnath.webservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarnath.webservices.limitsservice.bean.Limits;
import com.amarnath.webservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration conf;
	
	public LimitsController(Configuration conf) {
		super();
		this.conf = conf;
	}



	@GetMapping("/limits")
	public Limits getLimits() {
		
		return new Limits(1, 1000);
		
	}
	
	@GetMapping("/limits-conf")
	public Limits getLimitsConf() {
		
		return new Limits(conf.getMin(), conf.getMax());
		
	}
	
	

}
