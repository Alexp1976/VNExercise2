package com.visualnuts.exercise2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visualnuts.exercise2.api.CountriesRequest;
import com.visualnuts.exercise2.api.CountriesResponse;
import com.visualnuts.exercise2.api.service.CountryService;
import com.visualnuts.exercise2.exception.CountryServiceException;

@RestController
@RequestMapping("countries")
public class CountriesController {

	@Autowired
	private CountryService countryService;
	
	@PostMapping
	public CountriesResponse checkLanguages(@RequestBody List<CountriesRequest> request) throws CountryServiceException {
		
		return countryService.checkLanguages(request);
		
	}
}
