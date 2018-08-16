package com.chen.Demo.reader;

import com.chen.Demo.book.Book;
import com.chen.Demo.library.Library;

import java.util.ArrayList;

/**
 *   类Reader代表读者,Name字段代表其姓名,读者可以”ReturnBook(还书)”
 * 和”BorrowBook(借书)”.
 *  
 */
public class Reader {
    private String Name;

    public Reader() {
    }

    public Reader(String name) {
        Name = name;
    }

    public void returnBook(String name,String author){
        /*if(b.isBorrowed()){
            Library lib = new Library();
            lib.addBook(b);
            b.setBorrowed(false);
            System.out.println("还书成功");
        }else{
            System.out.println("还书失败");
        }*/
        Library lib = Library.getLib();
        ArrayList<Book> books = lib.getAllBooks();
        for (Book book : books) {
            if(name.equals(book.getName()) && author.equals(book.getAuthor())){
                book.setBorrowed(false);
                break;
            }
        }
    }

    public void borrowBook(String name,String author){
        /*if(!b.isBorrowed()){
            Library lib = new Library();
            ArrayList<Book> book = lib.findBook(b.getName());
            System.out.println("借书成功");
        }else{
            System.out.println("借书失败");
        }*/

        Library lib = Library.getLib();
        ArrayList<Book> books = lib.getAllBooks();
        for (Book b: books) {
            if(name.equals(b.getName()) && author.equals(b.getAuthor())){
                b.setBorrowed(true);
                break;
            }
        }
    }
}
