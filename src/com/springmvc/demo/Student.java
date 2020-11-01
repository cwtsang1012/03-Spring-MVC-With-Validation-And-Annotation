package com.springmvc.demo;

import java.util.*;

public class Student {
	private String firstname;
	
	private String lastname;
	
	private String country;
	
	private LinkedHashMap<String, String> languageOptions = new LinkedHashMap<String, String>();
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	public Student() {
		//populate country options: used ISO country code
		
		languageOptions.put("Java", "Java");
		languageOptions.put("C#", "C#");
		languageOptions.put("PHP", "PHP");
		languageOptions.put("Ruby", "Ruby");
		languageOptions.put("Python", "Python");
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
