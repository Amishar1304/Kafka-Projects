package com.yahoo.springconsumer.entity;

public class Child {
	private int id;
	private String name;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + "]";
	}
	
	

}
