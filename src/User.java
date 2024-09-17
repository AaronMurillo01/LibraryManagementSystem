// src/User.java
public class User {
    private String name;
    private Book issuedBook;

    public User(String name) {
        this.name = name;
        this.issuedBook = null;
    }

    public String getName() {
        return name;
    }

    public Book getIssuedBook() {
        return issuedBook;
    }

    public boolean hasIssuedBook() {
        return issuedBook != null;
    }

    public void issueBook(Book book) {
        if (!hasIssuedBook()) {
            issuedBook = book;
            book.issueBook();
            System.out.println(name + " has issued the book: " + book.getTitle());
        } else {
            System.out.println(name + " already has an issued book.");
        }
    }

    public void returnBook() {
        if (hasIssuedBook()) {
            System.out.println(name + " returned the book: " + issuedBook.getTitle());
            issuedBook.returnBook();
            issuedBook = null;
        } else {
            System.out.println(name + " has no issued books to return.");
        }
    }
}
