package com.vev.bsmj.ui;

import java.util.List;
import java.util.Scanner;

import com.vev.bsmj.excep.BookStoreException;
import com.vev.bsmj.model.Book;
import com.vev.bsmj.service.BookService;
import com.vev.bsmj.service.BookServiceImpl;

public class BookStoreManagementApp {
	
	private static BookService bookService;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		bookService = new BookServiceImpl();
		scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			System.out.println("Choice\t\tAction");
			System.out.println("-----------------------------------");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. List All Books");
			System.out.println("4. Quit");
			System.out.print("Enter choice : ");
			choice = scanner.nextInt();
			if (choice < 0 || choice > 4) {
				System.out.println("Invalid Choice");
			} else {
				switch (choice) {
				case 1 : doAdd();
						 break;
				case 2 : doRemove();
						 break;
				case 3 : doList();
				 		 break;
				case 4 : System.out.println("Thank You.");
						 break;
				}
			}
		}
	}
	
	private static void doAdd() {
		try {
			Book book = new Book();
			System.out.print("Enter book code : ");
			book.setBcode(scanner.next());
			System.out.print("Enter title : ");
			book.setTitle(scanner.next());
			System.out.print("Enter price : ");
			book.setPrice(scanner.nextDouble());
			
			bookService.add(book);
		} catch(BookStoreException excep) {
			System.out.println(excep.getMessage());
		}
	}

	private static void doList() {
		List<Book> books;
		try {
			books = bookService.getAllBooks();
			if (books.isEmpty()) {
				System.out.println("No books are available");
			} else {
				for(Book book : books) {
					System.out.println(book);
				}
			}
		} catch(BookStoreException excep) {
			System.out.println(excep.getMessage());
		}
	}
	
	private static void doRemove() {
		System.out.print("Enter book code : ");
		String bcode = scanner.next();
		try {
			boolean isDeleted = bookService.delete(bcode);
			if (isDeleted) 
				System.out.println("Book is deleted");
			else
				System.out.println("Book is not deleted");
		} catch(BookStoreException excep) {
			System.out.println(excep.getMessage());
		}
	}
}
