package com.example.demoExampleCrud.models;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="user_id",length = 10,nullable = false)
	private int id;

	@Column(name ="u_name",length = 30,nullable = false)
	private String name;

	@Column(name ="email",length = 40,nullable = false)
	private String email;


	public User() 
	{
		super();

	}


	public User(int id, String name, String email) 
	{
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}




}
