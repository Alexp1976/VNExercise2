package com.visualnuts.exercise2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visualnuts.exercise2.api.CountriesRequest;
import com.visualnuts.exercise2.api.CountriesResponse;
import com.visualnuts.exercise2.api.service.CountryService;

@RestController
@RequestMapping("countries")
public class CountriesController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping
	public CountriesResponse checkLanguages(@RequestBody List<CountriesRequest> request) {
		
		return countryService.checkLanguages(request);
		
	}
}
