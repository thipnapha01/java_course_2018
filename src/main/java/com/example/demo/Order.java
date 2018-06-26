package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<BookItem> bookItem = new ArrayList<BookItem>();
    private int bookAmount;
    private double totalPrice;
    private double discount;
    private double netPrice;

    public double getTotalPrice() {
       
        return totalPrice;
    }

    public int getBookAmount() {
      
        return bookItem.size();
    }

    public double getNetPrice() {
        
        return netPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void process() {
       if(!this.bookItem.isEmpty()){
           //Book amount = size of order
          for(BookItem book : bookItem){
              this.totalPrice += book.getTotalPrice();
           }
           
           //Calculate Price
//           this.totalPrice = bookItem.getBook().getPrice();  //code smell
           
           
           //Calculate Discount
           this.discount = 0;
           if(getBookAmount() == 2){
               discount = getTotalPrice() * 0.05 ;
           }
           if(getBookAmount() == 3){
               discount = getTotalPrice() * 0.1 ;
           }
           //Calculate net Price
           this.netPrice = getTotalPrice() - getDiscount();
       }
        
    }
    
    public void addItem(BookItem bookItem){
        this.bookItem.add(bookItem);
    }
    

}
