package com.helper.ua.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class City
{

	@Id
	private String name;

	public City()
	{
	}

	public City(final String name)
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
