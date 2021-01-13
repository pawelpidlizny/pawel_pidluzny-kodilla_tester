package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();

        Car sq1 = new Ford (1000);
        Car sq2 = new Opel(2000);
        Car sq3 = new Ford (3000);
        Car sq4 = new Opel(4000);

        cars.add(sq1);
        cars.add(sq2);
        cars.add(sq3);
        cars.add(sq4);


        cars.remove(1);
        cars.remove(new Opel(4000));

        System.out.println(cars.size());

        for (Car car: cars){
           CarUtils.describeCar(car);
        }
    }
}
