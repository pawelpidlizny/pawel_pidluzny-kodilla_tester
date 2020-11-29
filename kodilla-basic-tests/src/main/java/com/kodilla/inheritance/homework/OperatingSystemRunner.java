package com.kodilla.inheritance.homework;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setWindows();
        operatingSystem.setMacos();

        OperatingSystem macos,windows= new OperatingSystem(2,3);
    }
}
