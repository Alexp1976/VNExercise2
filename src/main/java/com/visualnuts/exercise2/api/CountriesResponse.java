package com.visualnuts.exercise2.api;

import java.util.List;

public class CountriesResponse {

	// returns the number of countries in the world
	private Long totalCountries;
	
	// finds the country with the most official languages, where they officially speak German (de)
	private String mostOfficialLanguages;
	
	// counts all the official languages spoken in the listed countries
	private Long totalLanguagesSpoken;
	
	// find the country with the highest number of official languages
	private String mostDiverseSpokenLanguages;
	
	// find the most common official language(s), of all countries.
	private List<String> mostCommonLanguage;

	public Long getTotalCountries() {
		return totalCountries;
	}

	public void setTotalCountries(Long totalCountries) {
		this.totalCountries = totalCountries;
	}

	public String getMostOfficialLanguages() {
		return mostOfficialLanguages;
	}

	public void setMostOfficialLanguages(String mostOfficialLanguages) {
		this.mostOfficialLanguages = mostOfficialLanguages;
	}

	public Long getTotalLanguagesSpoken() {
		return totalLanguagesSpoken;
	}

	public void setTotalLanguagesSpoken(Long totalLanguagesSpoken) {
		this.totalLanguagesSpoken = totalLanguagesSpoken;
	}

	public String getMostDiverseSpokenLanguages() {
		return mostDiverseSpokenLanguages;
	}

	public void setMostDiverseSpokenLanguages(String mostDiverseSpokenLanguages) {
		this.mostDiverseSpokenLanguages = mostDiverseSpokenLanguages;
	}

	public List<String> getMostCommonLanguage() {
		return mostCommonLanguage;
	}

	public void setMostCommonLanguage(List<String> mostCommonLanguage) {
		this.mostCommonLanguage = mostCommonLanguage;
	}
	
}
