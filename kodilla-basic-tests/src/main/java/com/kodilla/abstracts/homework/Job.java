package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String firstName;
    int age;
    char job;

    public Job(int salary, String firstName, int age, char job) {
        this.salary = salary;
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public abstract void responsibilities();

    public abstract void process();

}
