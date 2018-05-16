package com.revature.day3.beans;

import java.io.Serializable;

public class Geode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6296263012544470169L;
	private String color;
	private int transparency;
	private int hardness;
	private double weight;

	public Geode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geode(String color, int transparency, int hardness, double weight) {
		super();
		this.color = color;
		this.transparency = transparency;
		this.hardness = hardness;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTransparency() {
		return transparency;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}

	public int getHardness() {
		return hardness;
	}

	public void setHardness(int hardness) {
		this.hardness = hardness;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + hardness;
		result = prime * result + transparency;
		long temp;
		temp = Double.doubleToLongBits(weight);
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
		Geode other = (Geode) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (hardness != other.hardness)
			return false;
		if (transparency != other.transparency)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Geodes [color=" + color + ", transparency=" + transparency + ", hardness=" + hardness + ", weight="
				+ weight + "]";
	}

}
