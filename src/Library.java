// src/Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle() + " by " + book.getAuthor());
    }

    public void viewAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                return book;
            }
        }
        return null;
    }
}
