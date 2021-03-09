package com.kodillia.exception.optional;
import com.kodillia.exception.stream.User;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        User user = new User("user1", 30, 100, "Test");

        Optional<User>optionalUser=Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
