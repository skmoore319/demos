package com.revature.day3.dao;

import com.revature.day3.beans.Geode;

public interface GeodeDao {
	
	void saveGeode(Geode g);
	Geode[] findAll();
	Geode[] findAllByColor(String color);
	
}
