package com.mike.cpsc223j.project12;

public class CartItem {
	String name;
	double price;
	String color;
	
	public CartItem(String x, double y, String z) {
		name = x; price = y; color = z;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
