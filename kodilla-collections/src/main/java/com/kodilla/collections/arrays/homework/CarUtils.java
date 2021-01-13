package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
     public static void describeCar(Car car) {

         System.out.println("Car model " + carName(car));
         System.out.println("Current " + car.getSpeed());
     }
     private static String carName(Car car) {
         if (car instanceof Ford) {
             return "Ford Mustang";
         } else if (car instanceof Opel){
             return "Opel Corsa";
         }else {
             return "No car name detected ";

         }




     }
 }