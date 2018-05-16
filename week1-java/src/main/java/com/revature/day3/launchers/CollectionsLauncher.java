package com.revature.day3.launchers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.revature.day3.beans.Geode;

public class CollectionsLauncher {

	public static void main(String[] args) {
		// lists();
		// sets();
		// grocery list
		Map<String, Integer> groceryList = new HashMap<>();
		groceryList.put("apples", 3);
		groceryList.put("bananas", 1);
		groceryList.put("bacon", 12);

		System.out.println(groceryList.get("bacon"));
		
		for(String key: groceryList.keySet()) {
			System.out.println("key: " + key);
			System.out.println("value: " + groceryList.get(key));
		}
	
	}

	private static void sets() {

		Set<Geode> myGeodes = new HashSet<>();
		myGeodes.add(new Geode("orange", 2, 4, 6));
		myGeodes.add(new Geode("blue", 2, 4, 6));
		myGeodes.add(new Geode("blue", 2, 4, 6));
		System.out.println(myGeodes);
	}

	private static void lists() {
		List<Geode> myGeodes = new LinkedList<>();
		System.out.println(myGeodes);
		myGeodes.add(new Geode("orange", 2, 4, 6));
		myGeodes.add(new Geode("blue", 2, 4, 6));
		myGeodes.add(new Geode("blue", 2, 4, 6));
		System.out.println(myGeodes);

		System.out.println(myGeodes.get(0));

		System.out.println("start for each loop");
		for (Geode g : myGeodes) {
			System.out.println(g);
		}
	}
}
