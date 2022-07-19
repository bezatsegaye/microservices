package com.example.util;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.cloud.openfeign.FeignClient("employeeService")
// @org.springframework.cloud.openfeign.FeignClient(value = "employeeService", url = "localhost:8081")
public interface FeignClient {
	
	@RequestMapping(value = "/employee")
	public List<String> get();

}
