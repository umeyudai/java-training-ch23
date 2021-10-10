package com.umeyudai;

import java.util.List;

public class Pass2 {

	public static void main(String[] args) {
		List<Book> list = Book.getList();
		
		list.stream()
			.filter(book->book.getGenre()==Genre.SCIENCE)
			.map(Book::getTitle)
			.forEach(System.out::println);
	}

}
