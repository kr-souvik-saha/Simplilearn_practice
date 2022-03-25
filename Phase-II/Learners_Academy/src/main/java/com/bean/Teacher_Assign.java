package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Teacher_Assign {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int class_subject_id;
	private int teacher_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClass_subject_id() {
		return class_subject_id;
	}
	public void setClass_subject_id(int class_subject_id) {
		this.class_subject_id = class_subject_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public Teacher_Assign() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher_Assign(int id, int class_subject_id, int teacher_id) {
		super();
		this.id = id;
		this.class_subject_id = class_subject_id;
		this.teacher_id = teacher_id;
	}
	@Override
	public String toString() {
		return "Teacher_Assign [id=" + id + ", class_subject_id=" + class_subject_id + ", teacher_id=" + teacher_id
				+ "]";
	}
	
	
}
