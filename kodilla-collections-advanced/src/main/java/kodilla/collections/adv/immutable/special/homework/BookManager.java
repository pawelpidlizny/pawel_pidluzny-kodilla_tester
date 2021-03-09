package kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;

public class BookManager {
    public static HashSet<Book> books = new HashSet<>();

    public static Book createBook (String title, String author) {


        Book newBook = new Book(title,author);
        books.add(newBook);
        return newBook;

    }
}