package com.vev.sd.pojo;

import java.time.LocalDate;

public class Item implements Comparable<Item>{
	
	private int itemId;
	private String name;
	private double price;
	private LocalDate packageDate;
	private ItemCategory category;
	
	public Item() {
		/* default constructor */
	}

	public Item(int itemId, String name, double price, LocalDate packageDate, ItemCategory category) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.packageDate = packageDate;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPackageDate() {
		return packageDate;
	}

	public void setPackageDate(LocalDate packageDate) {
		this.packageDate = packageDate;
	}

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + ", packageDate=" + packageDate
				+ ", category=" + category + "]";
	}

	@Override
	public int compareTo(Item other) {
		return this.getPackageDate().compareTo(other.getPackageDate());
	}

}
