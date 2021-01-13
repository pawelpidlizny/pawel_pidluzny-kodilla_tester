package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;

    public Ford(int ford) {
        this.speed = ford;
    }
    public int getSpeed(){
        return speed;
    }
    public double increaseSpeed(){
        return  speed * 3;
    }
    public double decreaseSpeed(){
        return speed / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Ford{" + "speed=" + speed + '}';
    }
}
