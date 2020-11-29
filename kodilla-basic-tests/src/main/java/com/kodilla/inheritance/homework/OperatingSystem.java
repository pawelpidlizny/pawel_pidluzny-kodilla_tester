package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int macos;
    private int windows;

    public void turnOnMacos (){
        System.out.println("Włoczenie komputera Macos");
    }
    public void turnOnWindows (){
        System.out.println("Włoczenie komputera Windows");
    }
    public void setMacos (){
        System.out.println("System operacyjeny maca jest bardziej prosty w obsłudze z Roku 2020");
    }
    public void setWindows(){
        System.out.println("System operacyjeny Windowsa jest cieżki w obsłudze z Roku 2017");

    }
    public OperatingSystem(){
        System.out.println();
    }
    public OperatingSystem (int macos,int windows){
        this.macos=macos;
        this.windows=windows;
    }
    public int getMacos(){
        return macos;
    }
    public int getWindows(){
        return windows;
    }
}


