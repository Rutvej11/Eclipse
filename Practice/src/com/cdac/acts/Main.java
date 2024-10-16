package com.cdac.acts;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // Method to add books to the member's list of books in the map
    public static Map<Member, List<Book>> addBookToMember(Map<Member, List<Book>> bookMap, Member member, Book book) {
        // Check if the member already has a list of books
        if (!bookMap.containsKey(member)) {
            bookMap.put(member, new ArrayList<Book>());
        }
        // Add the book to the member's list of books
        bookMap.get(member).add(book);
        return bookMap;
    }

    // Method to find a member by ID
    public static Member findMemberById(List<Member> members, String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Method to find a book by ID
    public static Book findBookById(List<Book> books, String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();
        Map<Member, List<Book>> bookMap = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // Input books and members
        do {
            System.out.println("Enter id of Book:");
            String bookId = sc.nextLine();
            System.out.println("Enter name of Book:");
            String bookName = sc.nextLine();
            Book book = new Book(bookId, bookName);
            bookList.add(book);
            
            System.out.println("Enter id of member:");
            String memberId = sc.nextLine();
            System.out.println("Enter name of member:");
            String memberName = sc.nextLine();
            System.out.println("Enter age of member:");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            Member member = new Member(memberId, memberName, age);
            memberList.add(member);

            System.out.println("Enter 0 to exit or any other number to continue:");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
        } while (choice != 0);
        
        // Assign a book to a member
        System.out.println("Enter Member id to assign book:");
        String memberId = sc.nextLine();
        System.out.println("Enter book id to assign to Member:");
        String bookId = sc.nextLine();
        
        Member member = findMemberById(memberList, memberId);
        Book book = findBookById(bookList, bookId);

        if (member == null || book == null) {
            System.out.println("Invalid member or book ID.");
        } else {
            addBookToMember(bookMap, member, book);
            System.out.println("Book assigned successfully.");
        }

        // Display all members and their assigned books
        System.out.println("Books assigned to members:");
        System.out.println(bookMap);
        for (Map.Entry<Member, List<Book>> entry : bookMap.entrySet()) {
            System.out.println("Member: " + entry.getKey());
            System.out.println("Books: " + entry.getValue());
        }
 
        List <Book>bs=bookList.stream()
        		.filter(a->a.getBookName().startsWith("a"))
        		.collect(Collectors.toList());
        
        		
        		
        
    }}