package com.revature.day2.launchers;

import java.util.Arrays;

import com.revature.day2.beans.Pizza;

/**
 * Java is purely pass by value
 * 
 * @author USER
 *
 */
public class PassByLauncher {
	public static void main(String[] args) {
		int iOfMain = 5;
		passPrimitive(iOfMain);
		System.out.println("i after method " + iOfMain);
		
		Pizza p = new Pizza(5, "pepperoni", 5, 5, "red");
		passPizza(p);
		System.out.println("p after method " + p);
	}
	
	
	public static void passPrimitive(int i) {
		i++;
		System.out.println("i in method " + i);
	}
	
	public static void passPizza(Pizza p) {
		p.setRating(10);
		p = null;
		System.out.println("p in method " + p);
	}
}
