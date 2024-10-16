package com.cdac.Books1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



//Use Book class from Library application and use DataOuputStream and DataInputStream to write and read books  from binary file
public class Books {
	public static Set<Book> getSet(){
	    Set<Book> set = new HashSet<>();
//    public Book(String title, BookType bookType, double price, LocalDate publishedDate, String authorName, int quantity) {

	    set.add(new Book("shiv", BookType.FICTION, 200.0, LocalDate.parse("2000-02-14"), "shiv", 10));
	    set.add(new Book("frosty", BookType.NON_FICTION, 150.0, LocalDate.parse("2000-04-14"), "me", 5));
	    set.add(new Book("try fry", BookType.SCIENCE, 500.0,  LocalDate.parse("2000-03-14"), "try", 20));

	    return set;
	}
	
	public static void main(String[] args) {
		Set <Book> s=Books.getSet();
		
		try {	
//			DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("student.txt")));
//			for(Book book : s) {
//				//String title, BookType bookType, double price, LocalDate publishedDate, String authorName, int quantity
//				dos.writeUTF(book.getTitle());
//				dos.writeUTF(book.getBookType().toString());
//				dos.writeDouble(book.getPrice());
//				dos.writeUTF(book.getPublishedDate().toString());
//				dos.writeUTF(book.getAuthorName());
//				dos.write(book.getQuantity());
//				dos.flush();
//			}
			DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("student.txt")));
			List<Book> b1=new ArrayList<Book>();
			for(Book book : s) {
				//String title, BookType bookType, double price, LocalDate publishedDate, String authorName, int quantity
				String title1=dis.readUTF();
				String booktype=dis.readUTF();
				BookType b=BookType.valueOf(booktype);
				Double price=dis.readDouble();
				String pd=dis.readUTF();
				LocalDate pd1=LocalDate.parse(pd);
				
				String name=dis.readUTF();
				int quantity=dis.read();
				b1.add(new Book(title1,b,price,pd1,name,quantity));
				
			}dis.close();
			System.out.println("      ");
			s.addAll(b1);
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
