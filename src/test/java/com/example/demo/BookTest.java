package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {
    @Test
    public void createBookWithConstructor(){
        Book book1 = new Book("H1",8,2);
        Book book2 = new Book("H1",8,2);
        assertEquals(book1,book2);
    }
    public void createBookWithCreationMethod(){
        Book book1 = Book.creatHarryPotterOne();
        Book book2 = Book.creatHarryPotterTwo();
    }
    public void createBookWithBuilderPattern(){
        Book book1 =  new BookBuilder()
                            .setName("H1")
                            .setPrice(8).build();
                      
    }
}
