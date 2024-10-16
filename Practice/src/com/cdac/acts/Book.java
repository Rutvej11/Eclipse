package com.cdac.acts;

public class Book {
private String bookId;
private String bookName;
public Book(String bookId, String bookName) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
}


}
