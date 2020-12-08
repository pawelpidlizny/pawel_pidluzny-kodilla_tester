package com.kodilla.inheritance.homework;

import javax.crypto.Mac;

class MacOS extends OperatingSystem {

    public MacOS(int publicationYear) {
        super(publicationYear);
    }
    public void turnOn(){
        System.out.println("Urochamiam MacOs");
    }

}