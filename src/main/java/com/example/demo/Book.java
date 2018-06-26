package com.example.demo;

//Pojo(plain Old Java Object)
//getter setter 
public class Book {
    //Variable
    //Static variable
    private static final String QTY = "";
    //Non-static
    private String name ;
    private double price;
    private int stock;  
    //Constructor
    
    public Book(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
  //public method
    
    public static Book creatHarryPotterOne(){
        
        return new Book("H1",8,2);
    }
    
    public static Book creatHarryPotterTwo() {
      
        return new Book("H1",8,2);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + stock;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (stock != other.stock)
            return false;
        return true;
    }

    public double getPrice() {
        // TODO Auto-generated method stub
        return this.price;
    }
    
    //private method
}
