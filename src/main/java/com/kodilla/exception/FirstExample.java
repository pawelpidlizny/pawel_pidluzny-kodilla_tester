package com.kodilla.exception;

import java.util.SortedMap;

public class FirstExample {
    public static void main(String[] args) {
        String username = "John";
        String[] nameParts = username.split ( " ");
        System.out.println("Fistname:"+ nameParts[0]);
        System.out.println("Lastname:"+nameParts[1]);

    }
}
