package com.assignment2.question2;
import java.util.Scanner;
public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
				System.out.println("Here is the menu!!");
				
				System.out.println("Enter 1 to display books");
				System.out.println("Enter 2 to order new books");
				System.out.println("Enter 3 to sell books");
				System.out.println("Enter 0 to exit the syatem");
				int num = sc.nextInt();
				
				Book[] books = {new Book("java programming", "Joshua Bloch", "56789", 50), new Book("c programming", "Dennis", "901045", 34)};
				
				switch (num) {
				case 1:
					printBookInto(books);
					break;
				case 2:
					
					break;
				case 3: 
					
					break;
				case 0 :
					System.out.println("Exited!!");
					break;
				default:
					break;
				}
			}
			
			public static void printBookInto(Book[] books) {
				System.out.println("bookTitle " + " " + " bookAuthor " + " " + " ISBN " + " " + " numOfCopies ");
				for(int i=0;i<books.length;i++) {
					books[i].display();
				}
			}
}
