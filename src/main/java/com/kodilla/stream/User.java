package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPost;
    private String group;

    public User(String username, int age, int numberOfPost, String group) {
        this.username = username;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (numberOfPost != user.numberOfPost) return false;
        if (!Objects.equals(username, user.username)) return false;
        return Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + numberOfPost;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }
}
