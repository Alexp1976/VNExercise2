package com.visualnuts.exercise2.api.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.visualnuts.exercise2.api.CountriesRequest;
import com.visualnuts.exercise2.api.CountriesResponse;

@Service
public class CountryService {

	public CountriesResponse checkLanguages(List<CountriesRequest> request) {
		
		CountriesResponse response = new CountriesResponse();
		response.setTotalCountries(checkTotalCountries(request));
		response.setMostOfficialLanguages(findCountryWithGermanLanguage(request));
		response.setTotalLanguagesSpoken(totalLanguagesSpoken(request));
		response.setMostDiverseSpokenLanguages(countryWithMostOfficialLanguages(request));
		response.setMostCommonLanguage(mostSpokenOfficalLanguage(request));
		return response;
	}
	
	private Long checkTotalCountries(List<CountriesRequest> request) {
		
		return request.stream().count();
	}
	
	private String findCountryWithGermanLanguage(List<CountriesRequest> request) {
		
		Map<String, Integer> result = request.stream()
			.filter(f -> f.getLanguages().contains("de"))
			.collect(Collectors.toMap(CountriesRequest::getCountry, f -> f.getLanguages().size()));
		
		return result.isEmpty() ? null : Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey();
				
	}
	
	private Long totalLanguagesSpoken(List<CountriesRequest> request) {
		
		return request.stream()
				.map(f -> f.getLanguages().size())
				.distinct()
				.reduce(0, Integer::sum).longValue();
				
	}

	private String countryWithMostOfficialLanguages(List<CountriesRequest> request) {
		
		Map<String, Integer> result = request.stream()
											.collect(Collectors.toMap(CountriesRequest::getCountry, f -> f.getLanguages().size()));
		
		return Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey();
	
	}
	
	private List<String> mostSpokenOfficalLanguage(List<CountriesRequest> request) {
		
		Map<String, Long> count = request.stream()
			.map(CountriesRequest::getLanguages)
			.flatMap(List::stream)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Long value = Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getValue();
		
		return count.entrySet().stream().filter(f -> f.getValue().equals(value)).map(f -> f.getKey()).collect(Collectors.toList());
	}
}
