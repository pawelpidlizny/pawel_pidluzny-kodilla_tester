package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set <Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Bugatti","2",1923,true));
        stamps.add(new Stamp("Eagle","4",1924,false));
        stamps.add(new Stamp("Bugatti","2",1923,true));
        stamps.add(new Stamp("Bugatti","2",1923,true));
        stamps.add(new Stamp("Bugatti","2",1923,true));
        stamps.add(new Stamp("Eagle","4",1924,false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps){
            System.out.println(stamp);

        }
    }
}
