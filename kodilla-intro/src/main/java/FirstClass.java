public class FirstClass {
    public static void main(String[] args) {
        String[] movies = new String[5];

        movies[0] = "Harry Potter";
        movies[1] = "Lord of the Rings";
        movies[2] = "Forrest Gump";
        movies[3] = "Trylogy";
        movies[4] = "Hobbit";

        int number0fElements = movies.length;
        System.out.println("Movies length: "+ movies.length);


        for (int i = 0; i <=4; i ++ ) {
            System.out.println("Array element movies[" + i + "] = " + movies[i]);
        }
    }
}