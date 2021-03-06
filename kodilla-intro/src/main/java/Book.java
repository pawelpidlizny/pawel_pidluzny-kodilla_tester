public class Book {
    private final String author;
    private final String title;

    public static Book of(String author, String title) {
        return new Book(author, title);

    }

    public Book(String author, String title) {

        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");

        System.out.println(book.title + " " + book.author);

    }
}
