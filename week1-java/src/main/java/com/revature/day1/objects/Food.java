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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rating;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (rating != other.rating)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [volume=" + volume + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}

}
