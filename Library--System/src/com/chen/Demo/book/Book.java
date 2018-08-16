package com.chen.Demo.book;

/**
 * Book代表书,有”Name(书名)”,”Author(作者名)”,
 * ”Price(单价)”和IsBorrowed(是否被借出)”四个属性.
 */
public class Book {
    private String Name;
    private String Author;
    private int Price;
    private boolean IsBorrowed;

    public Book() {
    }

    public Book(String name, String author, int price, boolean isBorrowed) {
        Name = name;
        Author = author;
        Price = price;
        IsBorrowed = isBorrowed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public boolean isBorrowed() {
        return IsBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        IsBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                ", IsBorrowed=" + IsBorrowed +
                '}';
    }
}
