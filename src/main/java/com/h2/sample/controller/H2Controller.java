package com.h2.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.sample.service.InsertDataService;

@RestController
@RequestMapping("/insertData")
public class H2Controller {

	@Autowired
	InsertDataService service;

	@GetMapping("/{name}")
	public String insertDate(@PathVariable("name") String name) {
		return service.insertData(name);
	}

}
