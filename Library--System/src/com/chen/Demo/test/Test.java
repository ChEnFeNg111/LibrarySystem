package com.chen.Demo.test;

import com.chen.Demo.book.Book;
import com.chen.Demo.library.Library;
import com.chen.Demo.reader.Reader;

import java.util.ArrayList;

/**
 * 请编程完成以下工作:
 *  *
 *  *   1.用Java编程实现上述3个类
 *  *
 *  *   2.在main()方法内书写以下测试代码:
 *  *
 *  *    1)创建一个Library类的实例myLittleLibrary,其中预存有以下3本书:
 *  *
 *  *    Java程序设计,张三著,45元
 *  *
 *  *    Java核心技术,李四著,50元
 *  *
 *  *    Java程序设计,王五著,38元
 *  *
 *  *    2)显示图书馆中所有图书的信息,输出样例如下:
 *  *
 *  *    Java程序设计,张三著,45元,可借
 *  *
 *  *    Java核心技术,李四著,50元,可借
 *  *
 *  *    Java程序设计,王五著,38元,未还
 *  *
 *  *    3)(创建一个Reader类的实例oneBeautifulGirl,她先在myLittleLibrary中查找<
 *  *
 *  *    4)oneBeautifulGirl借了张三著的那一本书.现在显示图书馆中所有图书的信息.
 *  *
 *  *    5)oneBeautifulGirl把书还了,再次显示图书馆中图书的信息.
 */
public class Test {
    public static void main(String[] args) {
        Library mylibrary = Library.getLib();

        Book b1 = new Book("Java程序设计","张三著",45,false);
        Book b2 = new Book("Java核心技术","李四著",50,false);
        Book b3 = new Book("Java程序设计","王五著",38,false);

        //初始化图书馆
        mylibrary.addBook(b1);
        mylibrary.addBook(b2);
        mylibrary.addBook(b3);



        System.out.println("\t\t\t\t--------------图书馆-----------------\t\t\t\t");
        //显示所有图书
        ArrayList<Book> allBooks = mylibrary.getAllBooks();

        for (Book b: allBooks) {
            System.out.println(b.toString());
        }
        System.out.println();
        System.out.println();


        //根据书名查找图书信息
        System.out.println("\t\t\t\t---------根据书名查找图书信息--------\t\t\t\t");
        ArrayList<Book> book = mylibrary.findBook("Java核心技术");
        for(Book b : book){
            System.out.println(b.toString());
        }
        System.out.println();
        System.out.println();
        //借出 书
        System.out.println("\t\t\t\t--------------借书-----------------\t\t\t\t");
        Reader r1 = new Reader();
        r1.borrowBook("Java核心技术","李四著");
        for (Book b : allBooks) {
            System.out.println(b.toString());
        }
        System.out.println();
        System.out.println();

        //还书
        System.out.println("\t\t\t\t--------------还书-----------------\t\t\t\t");
        Reader r2 = new Reader();
        r2.returnBook("Java核心技术","李四著");
        for (Book b : allBooks) {
            System.out.println(b.toString());
        }
        System.out.println();
        System.out.println();


    }

}
