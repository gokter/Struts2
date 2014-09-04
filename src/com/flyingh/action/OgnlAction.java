package com.flyingh.action;

import java.util.ArrayList;

public class OgnlAction {
	private ArrayList<Book> books;

	public ArrayList<Book> getBooks() {
		return books;
	}

	public String getName() {
		return "OGNL";
	}

	public String execute() {
		books = new ArrayList<Book>();
		books.add(new Book(1, "java", 88));
		books.add(new Book(2, "C++", 85));
		books.add(new Book(3, "Android", 99));
		return "success";
	}
}
