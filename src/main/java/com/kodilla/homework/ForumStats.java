package com.kodilla.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();

        forumStats.average();
        forumStats.average2();
    }
    public void average() {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(ForumStats::NumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .orElse(0);
        System.out.println("Średnia postów użytkowników w wieku 40 lat i więcej wynosi : " + avg);
    }
    public void average2(){
       double avg2 =  UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(ForumStats::NumberOfPosts)
                .mapToInt(n -> n)
                .average()
               .orElse(0);
       System.out.println("Średnia postów użytkowników w wieku poniżej 40: " + avg2);
    }
    public static int NumberOfPosts(User user) {
        return user.getNumberOfPost();
    }
}
