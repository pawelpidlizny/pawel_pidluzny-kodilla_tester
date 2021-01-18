package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {

        Book book1 = BookManager.createBook("James Bond","Ian Fleming");
        Book book2 = BookManager.createBook("Bosch ","James Bond");
        Book book3 = BookManager.createBook("Zelmer","Bosch");
        Book book4 = BookManager.createBook("James Bond","Ian Fleming");

        System.out.println(book1==book4);
        System.out.println(book1==book3);
        System.out.println(book2==book1);

    }
}