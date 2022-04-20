package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class MessageController {
	private final Logger log=LoggerFactory.getLogger(MessageController.class);
	@GetMapping("/message")
	public String getMessage()
	{
		String nric="12345678D";
		Integer creditCard=12345678;
		log.info("this is user nric:"+nric);
		log.info("NRIC context set for NRIC="+nric);
		log.info("this is user creditCard:"+creditCard);
		log.info("card context set for creditCard="+creditCard);
		User user=new User("kim","12345678D",12345);
		log.info("Request Model====>:"    +user);
		return "log masking done.Please verify on console";
	}

}
