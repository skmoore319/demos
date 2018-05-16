package com.revature.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Book;

public class BookSerializer implements BookDao {
	private final String FILE_LOCATION = "src/main/resources/books.txt";

	@Override
	public boolean save(Book b) {
		List<Book> currentBooks = findAll();
		if (currentBooks == null) { // initialize a new list if none was given to us
			currentBooks = new ArrayList<>();
		}
		// add the new book to the list
		currentBooks.add(b);

		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(FILE_LOCATION))) {
			
			outStream.writeObject(currentBooks); // serialize the list to the file
			return true;
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean checkout(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		try (ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(FILE_LOCATION))) {
			
			
			return (List<Book>) inStream.readObject();
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Book> findAllByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
