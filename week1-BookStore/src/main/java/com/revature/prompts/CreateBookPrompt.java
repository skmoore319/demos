package com.revature.prompts;

import java.util.Scanner;

import com.revature.beans.Book;
import com.revature.dao.BookDao;
import com.revature.dao.BookSerializer;

public class CreateBookPrompt implements Prompt {
	private Scanner scan = new Scanner(System.in);
	private BookDao bookDao = new BookSerializer();

	@Override
	public Prompt run() {
		try {
			int id = 0;
			System.out.println("Enter the title of the book");
			String title = scan.nextLine();
			System.out.println("Enter the author of the book");
			String author = scan.nextLine();
			System.out.println("Enter the number of pages");
			int pages = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the year the book was published");
			int year = Integer.parseInt(scan.nextLine());
			System.out.println("Enter the condition of the book");
			String condition = scan.nextLine();

			Book newBook = new Book(0, title, author, pages, year, condition, null);
			bookDao.save(newBook);

			System.out.println("created book");
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input, try again");
		}

		return new MainMenuPrompt();
	}

}
