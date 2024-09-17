// src/LibraryManagement.java
import java.util.Scanner;

public class LibraryManagement {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeLibrary();
        boolean running = true;

        System.out.println("Welcome to the Library Management System!");

        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAvailableBooks();
                    break;
                case 2:
                    issueBookToUser();
                    break;
                case 3:
                    returnBookFromUser();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeLibrary() {
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));
    }

    private static void showMenu() {
        System.out.println("\nLibrary Menu:");
        System.out.println("1. View Available Books");
        System.out.println("2. Issue Book to User");
        System.out.println("3. Return Book from User");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void viewAvailableBooks() {
        library.viewAvailableBooks();
    }

    private static void issueBookToUser() {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        System.out.print("Enter book title to issue: ");
        String bookTitle = scanner.nextLine();
        Book book = library.findBook(bookTitle);

        if (book != null) {
            user.issueBook(book);
        } else {
            System.out.println("Book not available.");
        }
    }

    private static void returnBookFromUser() {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        if (user.hasIssuedBook()) {
            user.returnBook();
        } else {
            System.out.println(userName + " has no issued books.");
        }
    }
}
