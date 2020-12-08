package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationYear;

    public OperatingSystem(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void turnOn() {
        System.out.println("Uruchamiasz system operacyjny ");
    }

    public void turnOf() {
        System.out.println("Wyłaczma sysytem operacyjny ");
    }

}


