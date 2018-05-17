package com.revature.day4.launcher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.revature.day4.beans.Person;

public class CompareLauncher {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Luis", "Gonzalez", 30, 5.75, 000001));
		people.add(new Person("Fernando", "Hudson", 22, 5 + 10 / 12, 324809));
		people.add(new Person("Eric", "Morrison", 22, 5.8, 32489));
		people.add(new Person("Jonathon", "Medlock", 27, 5 + 10 / 12, 23432));
		people.add(new Person("Alina", "Hudson", 20, 5 + 4 / 12, 34214));

		System.out.println("before sort");
		System.out.println(people);
		// Collections.sort(people);
		// people.sort(new NameComparator());
		Comparator<Person> compare = (one, two) -> {
			return one.getAge() - two.getAge();
		};
		
		
		people.sort(compare);
		int i = 0;
		System.out.println("after sort");
		people.forEach((element) -> {
			System.out.println(element);
		});

	}
}
