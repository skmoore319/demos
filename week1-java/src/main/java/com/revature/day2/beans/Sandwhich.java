package com.revature.day2.beans;

import com.revature.day1.objects.Food;

/**
 * @author USER
 *
 */
public class Sandwhich extends Food {
	private String breadType;
		
	private int layers;

	public Sandwhich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sandwhich(double volume, String name, double price, int rating) {
		super(volume, name, price, rating);
		// TODO Auto-generated constructor stub
	}

	public Sandwhich(String breadType, int layers) {
		super();
		this.breadType = breadType;
		this.layers = layers;
	}
	
	public Sandwhich(double volume, String name, double price, int rating, String breadType, int layers) {
		super(volume, name, price, rating);
		this.breadType = breadType;
		this.layers = layers;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public int getLayers() {
		return layers;
	}

	public void setLayers(int layers) {
		this.layers = layers;
	}

	@Override
	public String toString() {
		return "Sandwhich [" + super.toString() + " breadType=" + breadType + ", layers=" + layers + "]";
	}
	
}
