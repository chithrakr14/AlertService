package com.is.alertservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {
	
/*Aler Controller -- Added by Chithra*/ 	
	@GetMapping("/alert")
	public List alert()
	{
		
		List<String> list = new ArrayList<String>();
		list.add("sms");
		list.add("email");
		list.add("pushnotification");
		
		
		return list;
	}
	
	

}
