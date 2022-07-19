package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.FeignClient;

@RestController
public class FeigClientEmployeeController {
	
	FeignClient feignClient;
	
	FeigClientEmployeeController(FeignClient feignClient) {
		this.feignClient = feignClient;
	}
	
	@RequestMapping(value = "/employee/name")
	public List<String> get() {
		return feignClient.get();
	}

}
