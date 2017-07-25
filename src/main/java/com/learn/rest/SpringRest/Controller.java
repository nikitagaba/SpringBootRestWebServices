package com.learn.rest.SpringRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	//localhost:8080 -> end point , parameter name = "NAME"
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld(@RequestParam(value="name",defaultValue="World") String name){
		return "Hello "+name;
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.POST)
	public String helloWorld2(@RequestBody String name){
		return "Hello "+name;
	}
}

