package com.visualnuts.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.visualnuts.exercise2.api.CountriesRequest;
import com.visualnuts.exercise2.api.CountriesResponse;
import com.visualnuts.exercise2.api.service.CountryService;

@SpringBootTest
class Exercise2ApplicationTests {

	@Autowired
	private CountryService countryService;
	
	private static List<CountriesRequest> mockedData;
	
	@BeforeAll
	public static void mockeData() {
		
		mockedData = new ArrayList<>();
		CountriesRequest country = new CountriesRequest();
		country.setCountry("US");
		List<String> languages = new ArrayList<>() {
			{
				add("en");				
			}
		};
		country.setLanguages(languages);
		mockedData.add(country);
	}
	
	@Test
	void returnNumberOfCountries() {
		
		CountriesResponse response = countryService.checkLanguages(mockedData);
		
		// Assertions bellow must be rewritten depending on mockedData
		assertEquals(1L, response.getTotalCountries());
		assertTrue(response.getMostCommonLanguage().contains("en"));
		assertEquals("US", response.getMostDiverseSpokenLanguages());
		assertEquals(null, response.getMostOfficialLanguages());
		assertEquals(1L, response.getTotalLanguagesSpoken());
	}
}
