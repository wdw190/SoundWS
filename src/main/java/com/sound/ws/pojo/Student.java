package com.sound.ws.pojo;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sid;

	private int age;

	private String name;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", age=" + age + ", name=" + name + "]";
	}

}
