package com.revature.day2.launchers;

public class StringLauncher {
	public static void main(String[] args) {
		String s = "hello";
		String s2 = new String("hello");
		String s3 = s +"o";
		s += "o";
		System.out.println(s3 == s);
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append("h");
		System.out.println(sb);
	}
}
