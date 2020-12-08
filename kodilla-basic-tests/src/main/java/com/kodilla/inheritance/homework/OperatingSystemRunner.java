package com.kodilla.inheritance.homework;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1990);
        operatingSystem.turnOn();
        operatingSystem.turnOf();

        MacOS macOS = new MacOS(1991);
        Windows windows = new Windows(2000);
        macOS.turnOn();
        windows.turnOf();





    }
}
