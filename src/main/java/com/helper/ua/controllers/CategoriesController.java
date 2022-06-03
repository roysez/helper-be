package com.helper.ua.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helper.ua.entities.Category;
import com.helper.ua.repositories.CategoryRepository;


@RestController
public class CategoriesController
{
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping(value = "/categories")
	public Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
}
