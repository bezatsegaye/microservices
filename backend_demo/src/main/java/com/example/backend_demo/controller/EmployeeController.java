package com.example.backend_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<String> get() {
        List<String> li = Arrays.asList("A", "B", "C");
        return li;
    }
}
