public class User {
    String name;
    int age;

        public User (String name,int age) {
            this.name=name;
            this.age=age;
        }
        public static void main(String[] args) {
            User[] user = new User[5];
            String[] name = {"Paulina", "Maciej","Paweł","Irena","Andrzej"};
            int [] age = { 21,23,12,15,31,};
            int i;

            for (i=0; i < user.length; i++) {
                user[i]= new User(name[i],age[i]);
                System.out.println("Imię:"+ user[i].name+", lat:"+ user [i].age);
            }
            System.out.println("Srednia wieku wynosi :   " + averageAge(age));
            for(i=1;i < user.length;i++)
                if (user[i].age<averageAge(age)) {
                    System.out.println("Użytkownik o wieku poniżej średniej;"+ user[i].name);
        }
    }
        public static int averageAge(int[] age) {
            int averageAge = 0;
            for (int value : age) {
                averageAge += value;
            }
            return averageAge / age.length;
        }
    }