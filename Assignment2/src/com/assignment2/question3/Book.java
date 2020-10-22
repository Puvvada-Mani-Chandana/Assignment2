package com.assignment2.question3;

	public class Book {
		private String bookTitle;
		private String bookAuthor;
		private String ISBN;
		private int noOfCopies;
		
		public Book() {
		
		}
		
		public Book(String bookTitle, String bookAuthor, String ISBN, int noOfCopies) {
			this.bookTitle = bookTitle;
			this.bookAuthor = bookAuthor;
			this.ISBN = ISBN;
			this.noOfCopies = noOfCopies;
		}
		
		public String getBookTitle() {
			return bookTitle;
		}

		public String getBookAuthor() {
			return bookAuthor;
		}
		
		public String getISBN() {
			return ISBN;
		}

		public int getNumOfCopies() {
			return noOfCopies;
		}

		public void setNumOfCopies(int numOfCopies) {
			this.noOfCopies = numOfCopies;
		}

		public void display() {
			System.out.println(bookTitle + " " + bookAuthor + " " + ISBN + " " + noOfCopies);
		}

}
