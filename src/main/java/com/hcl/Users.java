package com.hcl;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.*;

public class Users {
	private int id;
	@NotBlank(message = "Name must not be empty")
	@Size(min=15, max=20)
	private String name;
	@NotBlank(message = "Bg must not be empty")
	@Size(min=15, max=20)
	private String blood_group;
	@NotBlank(message = "City must not be empty")
	@Size(min=15, max=20)
	private String city;
	@NotBlank(message = "Pass must not be empty")
	@Size(min=15, max=20)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}