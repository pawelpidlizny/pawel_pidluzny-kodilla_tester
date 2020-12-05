package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args)
    {
        Punkt pt1 = new Punkt(0,0);
        Punkt pt2 = new Punkt(1,0);
        Punkt pt3 = new Punkt(0,1);

        Trojkat tr = new Trojkat(pt1, pt2, pt3);

        System.out.println("Pole trojkata: " + tr.pole());
        System.out.println("Obwod trojkata: " + tr.obwod());
    }
}
