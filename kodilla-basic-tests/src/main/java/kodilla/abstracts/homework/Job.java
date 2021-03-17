package kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String firstName;
    int age;
    char job;

    public Job(int salary, String firstName, int age) {
        this.salary = salary;
        this.firstName = firstName;
        this.age = age;


    }

    public abstract void responsibilities();

    public abstract void process();

}
