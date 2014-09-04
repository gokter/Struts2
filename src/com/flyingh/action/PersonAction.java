package com.flyingh.action;

import com.flyingh.vo.Person;

public class PersonAction {
	private String name;
	private Integer age;
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String execute() {
		return "success";
	}

	public String a() {
		return "success";
	}

	public String b() {
		return "success";
	}
}
