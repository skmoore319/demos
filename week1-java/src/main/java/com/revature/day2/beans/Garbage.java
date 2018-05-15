package com.revature.day2.beans;

public class Garbage {
	private int id;

	public Garbage(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("grabage with id " + id + " is being removed");
	}
}
