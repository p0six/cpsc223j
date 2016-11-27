package com.mike.cpsc223j.project12;

import java.util.Arrays;

public class ShoppingCart {
	int size = 10;
	CartItem[] cart = new CartItem[size];
	
	public ShoppingCart(int x) {
		cart = Arrays.copyOf(cart, x);
	}
	
	public int add (CartItem x) {
		int vacancy = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i].getName() == null) {
				vacancy = i;
				break;
			}
		}
		cart[vacancy] = x;
		return vacancy;
	}
}