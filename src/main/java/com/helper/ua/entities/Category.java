package com.helper.ua.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Category
{

	@Id
	private String name;

	public Category()
	{
	}

	public Category(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
}
