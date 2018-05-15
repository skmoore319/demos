package com.revature.day2.shops;

import com.revature.day2.beans.Sandwhich;

public class JimmyJohns implements SandwhichShop {

	@Override
	public Sandwhich createSandwhich(String name) {
		switch (name) {
		case "BLT":
			return new Sandwhich(5, "BLT", 5, 6, "rye", 5);
		default:
			return null;
		}
	}

}
