package kodilla.abstracts.homework;

public class Nurse extends Job {

    public Nurse(int salary, String firstName, int age, char job) {
        super(salary, firstName, age, job);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "\n" + "Salary: " + salary + "\n" + "Age: " + age + " \n" + "Job: " + job;
    }

    @Override
    public void process() {
        System.out.println("The nurse should give the patient an injection");
    }

    @Override
    public void responsibilities() {

        System.out.println("He helps the sick ");

    }
}
