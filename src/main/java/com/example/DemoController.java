package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${com.dudu.name}")
    private  String name;
    
    @Value("${com.dudu.want}")
    private  String want;
    
    @Value("${env}")
    private String env;
    
	@RequestMapping("/")
	public String index(){
		
		return "Hello spring boot!";
	}
	
	@RequestMapping("/1")
	public String index1(){
		
		return name+","+want + "," + env;
	}
}
