package com.cdac.Books1;

import java.time.LocalDate;
import java.util.Date;

enum BookType {
    FICTION, NON_FICTION, SCIENCE, HISTORY, BIOGRAPHY;
}

class Book {
    private String title;
    private BookType bookType;
    private double price;
    private LocalDate publishedDate;
    private String authorName;
    private int quantity;

    public Book(String title, BookType bookType, double price, LocalDate publishedDate, String authorName, int quantity) {
        this.title = title;
        this.bookType = bookType;
        this.price = price;
        this.publishedDate = publishedDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookType=" + bookType +
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}'+"\n";
    }
}
