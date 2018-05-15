package com.revature.day2.launchers;

import java.util.Arrays;

public class OverladingLauncher {
	
	public static void main(String ...whatever) {
		System.out.println(Arrays.toString(whatever));
		int test = 5;
		overloaded(test);
//		overloaded(test,2,3,4,5,1,2,3,4,1,2);
//		overloaded(test, test);
	}
	
	private static void overloaded(int i) {
		System.out.println("primitive int param method called");
	}
	
	private static void overloaded(long l) {
		System.out.println("primitve long param method called");
	}
	
	private static void overloaded(Integer i) {
		System.out.println("wrapper int param method called");
	}
	
	private static void overloaded(int i, int j) {
		System.out.println("method with 2 primitive ints called");
	}
	
	private static void overloaded(int ...args) {
		System.out.println("var args called with arguments" + Arrays.toString(args));
	}

}
