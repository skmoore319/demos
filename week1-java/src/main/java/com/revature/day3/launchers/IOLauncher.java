package com.revature.day3.launchers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.revature.day3.beans.Geode;
import com.revature.day3.dao.GeodeDao;
import com.revature.day3.dao.GeodeSerializer;

public class IOLauncher {
	public static void main(String[] args) {
		GeodeDao gd = new GeodeSerializer();
		Scanner scan = new Scanner(System.in);
//		writeByte();
//		readChar();
//		bufferedRead();
//		Geode g = new Geode("red", 3, 5, 8);
//		gd.saveGeode(g);
//		gd.saveGeode(new Geode("blue", 3, 10, 20.2));
		
		String color;
		System.out.println("Please enter the geodes color:");
		color = scan.nextLine();
		
		int transparency;
		System.out.println("Please enter the goedes transparency:");
		transparency = Integer.parseInt(scan.nextLine());
		
		int hardness;
		System.out.println("Please enter the geodes hardness:");
		hardness = Integer.parseInt(scan.nextLine());
		
		double weight;
		System.out.println("Please enter the geodes weight:");
		weight = Double.parseDouble(scan.nextLine());
		
		gd.saveGeode(new Geode(color, transparency, hardness, weight));		
		
		System.out.println(Arrays.toString(gd.findAll()));
	}
	
	private static void writeByte() {
		try (FileOutputStream outStream = new FileOutputStream("test.txt")){
			outStream.write(5);
			outStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	private static void readChar() {
		try (FileReader reader = new FileReader("test.txt")) {
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
			System.out.println((char) reader.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void bufferedRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			String s;
			do {
				 s = br.readLine();
				 System.out.println(s);
			} while (s != null);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
