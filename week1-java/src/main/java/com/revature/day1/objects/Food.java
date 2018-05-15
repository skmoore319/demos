package com.revature.day1.objects;

public class Food {
	static {
		System.out.println("this will run once at the time the class is loaded");
	}
	
	public static int numberOfFoodCreated = 0;

	private double volume; // in in^3

	private String name;

	private double price;

	private int rating;
	
	{
		System.out.println("this will run everytime an object of this class is instantiated");
	}

	public Food() {
		this(24, "Chicken", 13, 2);
	}

	public Food(double volume, String name, double price, int rating) {
		super();
		this.volume = volume;
		this.name = name;
		this.price = price;
		this.rating = rating;
		Food.numberOfFoodCreated += 1;
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
