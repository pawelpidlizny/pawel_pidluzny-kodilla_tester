package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .map(User::getAge)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}