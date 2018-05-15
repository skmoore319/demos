package com.revature.day2.launchers;

import com.revature.day2.beans.Garbage;

public class GarbageLauncher {
	public static void main(String[] args) {
		Garbage g = new Garbage(1);
		g = null;
		
		
//		System.gc(); // I am not forcing gc I am only requesting it
		for(int i = 0; i <= 100000000; i++) {
			new Garbage(i);
		}
	}
}
