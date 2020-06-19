package com.webservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWoildController {
	 @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
	    public HelloWorldBean HelloWorldBean() {
	    	return new HelloWorldBean("Hello World");
	    }
}
