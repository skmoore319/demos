package com.revature.day2.launchers;

import java.io.IOException;

public class ExceptionLauncher {

	public static void main(String[] args) {
		
		throwsException(true);
		try {
			duckExcpetion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = null;
		equalsHello(s);
	}

	private static void equalsHello(String s) {
		System.out.println("hello".equals(s));
	}

	private static void throwsException(boolean b) {
		try {
			if (b) {
				throw new Exception();
			} else {
				throw new IOException();
			}
		} catch (IOException e) {
			System.out.println("io exception caught, resuming execution");
		} catch (Exception e) {
			System.out.println("caught exception resuming execution");
		} finally {
			System.out.println("always executes regardless of if an exception was thrown or not");
		}

	}

	private static void duckExcpetion() throws Exception {
		throw new Exception();
	}

}
