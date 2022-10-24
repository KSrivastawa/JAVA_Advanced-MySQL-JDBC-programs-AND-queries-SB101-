package book.library.system;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

	List<Book> books = new ArrayList<>();	
	
	void addBook(Book book)throws BookException{
		
		if(book != null) {
				if(book.equals(books)) {
					
					BookException bookException = new BookException("Book is already exist.");
					throw bookException;
					
				}
				else {
					
						this.books.add(book);
					
						System.out.println("Book added successfully");
				}
			
		}
		

	}
	
	List viewAllBooks()throws BookException{
		
		if(books.size() >= 1) {		
			List<Book> bookList = books.stream().sorted((o1, o2)-> o1.getBookName()
					.compareToIgnoreCase(o2.getBookName())).collect(Collectors.toList());
			
			return bookList;
		}
		
		else {
			
			BookException bookException = new BookException("Opps! Library is Empty...");
			throw bookException;
			
		}
		
		
	}
	
	List viewBooksByAuthor(String author)throws BookException{
		
		if(author != null) {
			for(int i=0; i<books.size(); i++) {
				if(books.get(i).getAuthor().contains(author)) {
					return books;
				}
				
			}

		}
			
		BookException bookException = new BookException("None of the book published by the author "+author );
		throw bookException;
			
		
	}

	
	Book getBookByISBN(int isbn)throws BookException{
			
			if(isbn != 0) {
				for(int i=0; i<books.size(); i++) {
					if(books.get(i).getIsbn()== isbn) {
						return books.get(i);
					}
					
				}
	
			}
				
			BookException bookException = new BookException("None of the book published by the Isbn "+isbn );
			throw bookException;
				
		
			
		}
	
	
	
}
