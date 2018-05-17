package com.revature.day4.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.day3.beans.Geode;
import com.revature.day4.beans.Person;

public class StreamLauncher {
	public static void main(String[] args) {
		List<Person> trainers = new ArrayList<>();
		trainers.add(new Person("Wezley", "Singleton", 28, 6, 523432));
		trainers.add(new Person("Nickolas", "Jurzack", 21, 6.3, 234241));
		trainers.add(new Person("Trevatur", "Chester", 25, 5.9, 231432));
		trainers.add(new Person("Steve", "Kelsey", 28, 5.7, 234324));

		List<Geode> filtered = trainers.parallelStream()
				.filter((trainer) -> trainer.getHeight() <= 6)
				.map((trainer) -> {
					if (trainer.getAge() > 25) {
						return new Geode("red", 2, 8, 100);
					} else {
						return new Geode("blue", 8, 2, 50);
					}
				})
				.collect(Collectors.toList());

		filtered.forEach(each -> {
			System.out.println(each);
		});

		System.out.println("original list");
		trainers.forEach(trainer -> {
			System.out.println(trainer);
		});
	}
}
