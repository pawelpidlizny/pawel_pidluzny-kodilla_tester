package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private final double Ford;

    public Ford(double ford) {
        Ford = ford;
    }

    public int getSpeed(){
        return 100;
    }

    public double increaseSpeed(){
        return  50 * 100;
    }
    public double decreaseSpeed(){
        return 2* 40* 50;
    }

    public double getFord() {
        return Ford;
    }
}
