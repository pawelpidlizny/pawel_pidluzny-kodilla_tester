package kodilla.abstracts.homework;

public class Abstract {

    public Abstract() {

    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor(5000, "Dawid", 22, 'D');
        Nurse nurse = new Nurse(4000, "Amelia", 30, 'N');

        System.out.println("\nDoctor:\n");
        System.out.println(doctor.toString());
        doctor.responsibilities();
        doctor.process();

        System.out.println("\nNurse:\n");
        System.out.println(nurse.toString());
        nurse.responsibilities();
        nurse.process();


    }
}