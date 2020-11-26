import java.util.Scanner;
public class UserColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          boolean shouldColors=true;

          while (shouldColors) {
              System.out.println("Please choose first letter of color:");
              System.out.println("1. G");
              System.out.println("2. R");
              System.out.println("3. B");
              System.out.println("4. Y");
              System.out.println("5. Close");
          }
            int use = (scanner.nextInt());
        int color = 0;
        switch (color){
                case 1:
                    System.out.println("You choose Green ");
                    break;
                case 2:
                    System.out.println(" You choose Red");
                case 3:
                    System.out.println("You choose Black");
                    break;
                case 4:
                    System.out.println("You choose Yellow");
                    break;
                    default:
                    System.out.println("false");
            }
        }
    }
