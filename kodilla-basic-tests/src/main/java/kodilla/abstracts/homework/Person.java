package kodilla.abstracts.homework;

public class Person {
    private final String firstName;
    private final int age;
    private final Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println(job);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;

    }
}