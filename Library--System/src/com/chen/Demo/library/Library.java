package com.chen.Demo.library;

import com.chen.Demo.book.Book;

import java.util.ArrayList;

/**
 * 类Library代表图书馆,其内部字段books用于保存图书馆中所有的书.
 * 它的FindBook()方法依据书名查找相同的书(可能有多本).
 * 另一个GetAllBooks()方法湖区馆藏所有书的详细信息.
 */
public class Library {
    private static Library lib = null;

    //用来存储图书
    private ArrayList<Book> books = new ArrayList<Book>();

    //获取图书馆对象,
    public static Library getLib(){
        if(lib == null){
            return lib=new Library();
        }else{
            return lib;
        }
    }

    //初始化图书馆,添加图书
    public void addBook(Book b){
        books.add(b);
    }

    //根据书名查找图书,并返回一个 ArrayList<Book> 集合
    public ArrayList<Book> findBook(String name){
        ArrayList<Book> list = new ArrayList<>();
        for (Book b: this.books) {
            if(name!=null && b.getName().equals(name)){
                list.add(b);
            }
        }
        return list;
    }

    //获取图书馆里所有的图书,并将 ArrayList<Book> 返回
    public ArrayList<Book> getAllBooks(){
       return books;
    }
}
