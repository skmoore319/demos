package com.revature.day4.comparators;

import java.util.Comparator;

import com.revature.day4.beans.Person;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int lastNameComparison = o1.getLastName().compareTo(o2.getLastName());
		if (lastNameComparison == 0) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		} else {
			return lastNameComparison;
		}
	}
}
