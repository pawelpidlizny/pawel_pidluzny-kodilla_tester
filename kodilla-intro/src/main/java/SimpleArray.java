public class SimpleArray {
    public static void main(String[] args) {

        String[] movies = new String[5];

        movies[0] = "Harry Potter";
        movies[1] = "Lord of the Rings";
        movies[2] = "Forrest Gump";
        movies[3] = "Trylogy";
        movies[4] = "Hobbit";

        String movie0 = movies[0];
        String movie1 = movies[1];
        String movie2 = movies[2];
        String movie3 = movies[3];
        String movie4 = movies[4];

        int number0fElements = movies.length;

        System.out.println("Movies length: " +  movies.length);
        System.out.println(movies[0]);
        System.out.println(movies[1]);
        System.out.println(movies[2]);
        System.out.println(movies[3]);
        System.out.println(movies[4]);
    }
}