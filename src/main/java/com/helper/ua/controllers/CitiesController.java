package com.helper.ua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helper.ua.entities.Category;
import com.helper.ua.entities.City;
import com.helper.ua.repositories.CategoryRepository;
import com.helper.ua.repositories.CityRepository;


@RestController
public class CitiesController
{
	@Autowired
	private CityRepository cityRepository;
	
	@GetMapping(value = "/cities")
	public Iterable<City> getAllCategories(){
		return cityRepository.findAll();
	}
}
