package com.revature.day1.objects;

public class Food {

	private double volume; // in in^3

	private String name;

	private double price;

	private int rating;

	public Food() {
		this(24, "Chicken", 13, 2);
	}

	public Food(double volume, String name, double price, int rating) {
		super();
		this.volume = volume;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Food [volume=" + volume + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

}
