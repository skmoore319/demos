package com.revature.day2.launchers;

import java.util.Arrays;

public class ArraysLauncher {
	
	public static void main(String[] args) {
		int i = 5;
		int arr[] = new int[i];
		System.out.println(arr[0]);
		arr[0] = 7;
		arr[3] = 15;
		change5thElementTo10(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("length = " + arr.length);
		
		int[] ints = { 15, 2, 8, 43 };
		System.out.println(Arrays.toString(ints));
		Arrays.sort(ints);
		System.out.println(Arrays.toString(ints));
		
		int[][] matrix = new int[10][5];
		matrix[5][4] = 3;
		for(int[] row: matrix) {
			for(int col: row) {
				System.out.print(col+",");
			}
			System.out.print("\n");
		}
		
		String[] names = { "kyle", "Ruthanna", "scott", "tyler" };
		
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	private static void change5thElementTo10(int[] arr) {
		if(arr.length < 5) {
			return;
		} else {
			arr[4] = 10;
		}
	}

}
