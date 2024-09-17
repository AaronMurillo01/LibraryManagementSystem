
# Library Management System

## Project Overview
The Library Management System is a simple console-based Java application that allows users to manage books in a library. Users can view available books, issue books to users, and return issued books. This project demonstrates object-oriented programming (OOP) concepts such as classes, objects, and data encapsulation.

## Features
- **Add Books**: Add new books to the library.
- **View Available Books**: Display all books that are currently not issued to any user.
- **Issue Books**: Issue a book to a user.
- **Return Books**: Return a book that a user has issued.

## Folder Structure
```
LibraryManagementSystem/
│
├── src/
│   ├── Book.java              # Class to represent each book
│   ├── Library.java           # Class to manage the book collection and operations
│   ├── User.java              # Class to represent a user
│   └── LibraryManagement.java # Main class to run the library system
└── .vscode/                   # Optional (for debugging in VSCode)
    └── launch.json            # Optional (VSCode debugging config)
```

## Prerequisites
Before running the application, ensure you have the following installed:
1. **Java Development Kit (JDK)**: Download and install JDK (version 17 or later recommended). You can check if it's installed using:
   ```bash
   java -version
   ```

2. **Text Editor or IDE**: You can use any text editor or IDE. We recommend using [Visual Studio Code](https://code.visualstudio.com/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## How to Run
1. Clone or download the project files to your local machine.
2. Open a terminal in the `LibraryManagementSystem/` directory.
3. Navigate to the `src/` folder:
   ```bash
   cd src
   ```
4. Compile the Java files:
   ```bash
   javac Book.java Library.java User.java LibraryManagement.java
   ```
5. Run the application:
   ```bash
   java LibraryManagement
   ```

## Future Enhancements
- **User Authentication**: Implement a system where users can log in and keep track of their issued books.
- **Database Integration**: Store the book and user data in a database for persistence.
- **Graphical User Interface (GUI)**: Build a GUI using JavaFX or Swing for a better user experience.
