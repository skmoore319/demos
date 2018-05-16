package com.revature.prompts;

import java.util.Scanner;

import com.revature.dao.BookDao;
import com.revature.dao.BookSerializer;

public class MainMenuPrompt implements Prompt {

	private BookDao bookDao = new BookSerializer();

	@Override
	public Prompt run() {
		System.out.println("Enter 1 to checkout a book");
		System.out.println("Enter 2 to return a book");
		System.out.println("Enter 3 to see a list of all books");
		System.out.println("Enter 4 to search for books by title");
		System.out.println("Enter 5 to create a new book");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		switch (input) {
		case "1":
			System.out.println("Enter the id of the book you wish to checkout");
			break;
		case "2":
			System.out.println("Enter the id of the book you wish to return");
			break;
		case "3":
			System.out.println(bookDao.findAll());
			break;
		case "4":
			System.out.println("Enter the title you wish to search for");
			break;
		case "5":
			return new CreateBookPrompt();
		default:
			System.out.println("Invalid option");
			break;
		}

		return this;
	}

}
