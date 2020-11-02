import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");

        int year = scanner.nextInt();

        if (year % 4 != 0) {
            System.out.println("Is not a leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Is a leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Is not a leap Year");
        } else {
            System.out.println("Is a leap Year");
        }
    }
}