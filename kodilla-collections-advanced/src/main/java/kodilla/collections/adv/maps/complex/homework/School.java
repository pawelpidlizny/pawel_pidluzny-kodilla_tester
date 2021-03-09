package kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;

    private final List<Integer> numberOfStudents = new ArrayList<>();

    public School(String schoolName, int... numberOfStudents) {
        this.schoolName = schoolName;
        for (int student : numberOfStudents)
            this.numberOfStudents.add(student);

    }

    public int sumOfStudents() {
        int sum = 0;
        for (Integer numberOfStudent : numberOfStudents) {
            sum += numberOfStudent;
        }
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
