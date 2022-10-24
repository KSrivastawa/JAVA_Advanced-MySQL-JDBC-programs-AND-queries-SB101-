package com.Q1;

import java.util.*;

public class Main {

	public static void main(String[] args) throws BookException {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Library library = new Library();
			
			int count =1; 
			
			while(true) {
				
				System.out.println("Sample Input and Output" + count++ +":");
				
				System.out.println("1.Add Book\r\n"
						+ "2.Display all book details\r\n"
						+ "3.Search Book by author\r\n"
						+ "4.Search book by ISBN\r\n"
						+ "5.Exit\r\n"
						+ "");
				
				
				System.out.print("Enter the choice: ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.print("Enter the isbn no: ");
					int isbn = sc.nextInt();
					
					System.out.print("Enter the book name: ");
					String bookName = sc.next();
					
					System.out.print("Enter the author name: ");
					String authorName = sc.next();
					
					library.addBook(new Book(isbn, bookName, authorName));
					
				}
				
				else if(choice == 2) {
					
					System.out.println(library.viewAllBooks());

				}
				else if(choice == 3) {
					System.out.println("Enter the author name:");
					String authorName = sc.next();
					
					System.out.println(library.viewBooksByAuthor(authorName));
					

					
				}
				else if(choice == 4) {
					System.out.println("Enter the Isbn:");
					int isbn = sc.nextInt();
					
					System.out.println(library.getBookByISBN(isbn));
					

					
				}
				

				else if(choice ==5) {
					System.out.println("Thank You!!");
					break;
				}
				
				
			}
			
			
			
		}catch (BookException e) {
			
			System.out.println(e.getMessage());
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
