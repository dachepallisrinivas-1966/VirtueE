package com.vev.model;

public class Product {
	private int id;
	private String name;
	private String descr;
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
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, descr=%s]", id, name, descr);
	}
}
