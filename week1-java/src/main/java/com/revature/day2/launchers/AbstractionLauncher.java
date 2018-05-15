package com.revature.day2.launchers;

import com.revature.day2.abstractclasses.MyAbstractClass;
import com.revature.day2.abstractclasses.MyConcreteClass;
import com.revature.day2.shops.JimmyJohns;
import com.revature.day2.shops.PizzaShop;
import com.revature.day2.shops.SandwhichShop;
import com.revature.day2.shops.Subway;

public class AbstractionLauncher {
	
	
	public static void main(String[] args) {
		SandwhichShop shop = new Subway();
		System.out.println(shop.createSandwhich("BLT"));
//		System.out.println(shop.creatPizza("Boneless"));
		
		MyAbstractClass mac = new MyConcreteClass();
		System.out.println(mac.abstractMethod());
	}
	
}
