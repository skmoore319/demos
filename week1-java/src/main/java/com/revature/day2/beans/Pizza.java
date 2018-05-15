package com.revature.day2.beans;

import com.revature.day1.objects.Food;

public class Pizza extends Food {

	private String sauce;

	public Pizza(double volume, String name, double price, int rating, String sauce) {
		super(volume, name, price, rating);
		this.sauce = sauce;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	@Override
	public String toString() {
		return "Pizza ["+ super.toString() + " sauce=" + sauce + "]";
	}

}
