package com.helper.ua.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Request
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String fullName;

	private String email;

	private String title;

	private String request;

	@ManyToOne
	private Category category;

	@ManyToOne
	private City city;

	public Integer getId()
	{
		return id;
	}

	public void setId(final Integer id)
	{
		this.id = id;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName(final String fullName)
	{
		this.fullName = fullName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(final String title)
	{
		this.title = title;
	}

	public String getRequest()
	{
		return request;
	}

	public void setRequest(final String request)
	{
		this.request = request;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(final Category category)
	{
		this.category = category;
	}

	public City getCity()
	{
		return city;
	}

	public void setCity(final City city)
	{
		this.city = city;
	}
}
