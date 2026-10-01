package com.example.maven_github_demo;

public class library {
	String bookname;
	String author;

	public static void main(String[] args) {
		library book= new library();
		book.bookname="java programming";
		book.author="herbet schidt";
		 System.out.println("BookName :"+book.bookname);
		 System.out.println("AuthorName :"+book.author);
		
	}

}
