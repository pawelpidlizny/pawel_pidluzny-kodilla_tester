package com.kodilla.inheritance.homework;

import javax.crypto.Mac;

class MacOS extends OperatingSystem {

    public void setMacos() {
        System.out.println("Wydany system w roku 2015 ");
    }
    public void openMacOs () {
        System.out.println("Flap opening");
    }
    public void closeMacOs(){
        System.out.println( "Closing the flap");
    }
    public void openFlap(){
        System.out.println("Opening 2 Flap");
    }
    public void macos() {
        System.out.println("Convertible constructor");
    }
    @Override
    public void turnOnMacos() {
        super.turnOnMacos();
    }
}