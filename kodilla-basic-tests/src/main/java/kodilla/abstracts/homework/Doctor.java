package kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor(int salary, String firstName, int age) {
        super(salary, firstName, age);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + "\n" + "Salary: " + salary + "\n" + "Age: " + age + " \n";
    }

    @Override
    public void process() {

        System.out.println("The obligation to treat people ");
    }

    @Override
    public void responsibilities() {
        System.out.println("Heals neoplastic diseases");

    }


}
