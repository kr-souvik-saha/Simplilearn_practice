package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Class_Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int class_id;
	private String sub_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	public Class_Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class_Subject(int id, int class_id, String sub_name) {
		super();
		this.id = id;
		this.class_id = class_id;
		this.sub_name = sub_name;
	}
	@Override
	public String toString() {
		return "Class_Subject [id=" + id + ", class_id=" + class_id + ", sub_name=" + sub_name + "]";
	}
	
	 
}
