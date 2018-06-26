package com.example.demo;

public class BookItem {

    private Book book;
    private int quantity;

    public BookItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

/*    public Book getBook() {
        
        return book ;
    }*/

    public double getTotalPrice() {
        
        return book.getPrice() * quantity;
    }
    public int getBookAmount() {
        
        return quantity;
    }


    
}
