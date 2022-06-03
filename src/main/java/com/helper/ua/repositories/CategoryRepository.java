package com.helper.ua.repositories;

import org.springframework.data.repository.CrudRepository;

import com.helper.ua.entities.Category;


public interface CategoryRepository extends CrudRepository<Category, Integer>
{
}
