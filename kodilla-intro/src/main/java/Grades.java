public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastElements() {
        return grades[size - 1];
    }

    public double getAvg() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        grades.add(7);
        grades.add(8);
        grades.add(9);
        grades.add(10);
        System.out.println(grades.getLastElements());
    }
}