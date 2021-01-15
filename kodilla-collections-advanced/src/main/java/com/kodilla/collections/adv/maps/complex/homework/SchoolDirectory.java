package com.kodilla.collections.adv.maps.complex.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal,School> map = new HashMap<>();

        map.put(new Principal("John","Bosch"),new School("Kenedy School",20 ,10, 30 ,35));
        map.put(new Principal("Mark","Zelman"),new School("Oak School",30 ,40, 60 ,78));
        map.put(new Principal("Jadzia","Kowalska"),new School("Braun School",90 ,91, 40));

        for (Map.Entry<Principal,School> info : map.entrySet()){
            System.out.println("\nSchool Name: " + info.getValue().getSchoolName() + "\nPrincipal: "
                    +  info.getKey().getPrincipalName() + " " + info.getKey().getPrincipalSurname()
                    + "\nNumber of Students: " + info.getValue().sumOfStudents());
        }

    }
}
