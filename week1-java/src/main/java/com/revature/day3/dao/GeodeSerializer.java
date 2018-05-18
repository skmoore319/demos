package com.revature.day3.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

import com.revature.day3.beans.Geode;

public class GeodeSerializer implements GeodeDao {
	private Logger log = Logger.getRootLogger();

	@Override
	public void saveGeode(Geode g) {
		Geode[] geodes = findAll(); // get all geodes we already have
		Geode[] updatedList = new Geode[geodes.length + 1];
		log.trace("populating a new list with old geodes");

		// populate a new list with everything we already had
		for (int i = 0; i < geodes.length; i++) {
			updatedList[i] = geodes[i];
		}
		log.trace("adding new geode to the updated list");
		updatedList[geodes.length] = g;

		// write new list to file
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("geodes.txt"))) {
			oos.writeObject(updatedList);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Geode[] findAll() {
		try (ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("geodes.txt"))) {
			Geode[] geodes = (Geode[]) inStream.readObject();
			return geodes;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
		}

		return new Geode[0];
	}

	@Override
	public Geode[] findAllByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
