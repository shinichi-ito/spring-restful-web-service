package com.webservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWoildController {

	
	 @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	 @ResponseBody
	    public String HelloWorldBean() {
	    	return "Hello World";
	    }

	    @GetMapping(path = "/hello-world2")
	    @ResponseBody
	    public String helloWorld() {
	        return "Hello World2";
	    }
}
