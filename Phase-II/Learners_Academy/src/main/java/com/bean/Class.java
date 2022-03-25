package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Class {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
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
	public Class(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + "]";
	}
	
	
}
