package com.kodilla.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge()>=40)
                .map(ForumStats::NumberOfPosts)
                .mapToInt(n -> n)
                .getClass();
        System.out.println("Średnia postów użytkowników w wieku 40 lat i więcej wynosi : " );

        UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(ForumStats:: NumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Średnia postów użytkowników w wieku poniżej 40: " );

    }
    public static int NumberOfPosts(User user) {
        return user.getNumberOfPost();
    }
}
