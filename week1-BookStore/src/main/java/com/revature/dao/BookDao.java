package com.revature.dao;

import java.util.List;

import com.revature.beans.Book;

public interface BookDao {

	boolean save(Book b);

	boolean checkout(Book b);

	boolean returnBook(Book b);

	boolean delete(Book b);

	List<Book> findAll();

	List<Book> findAllByTitle();

}
