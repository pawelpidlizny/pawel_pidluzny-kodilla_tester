package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public void setWindows (){
        System.out.println("Wydany system jest roku 2016");
    }
    public void openWindows () {
        System.out.println("Flap opening");
    }
    public void closeWindows(){
        System.out.println("Closing the flap");
    }
    public void openFlap(){
        System.out.println("Opening 2 Flap");
    }
    public void windows(){
        System.out.println("Convertible constructor");
    }
    public void turOnWindows(){
        super.turnOnWindows();
    }
}
