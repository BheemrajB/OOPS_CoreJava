package AssignmentTelusko;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println( title + "' has been checked out.");
        } else {
            System.out.println( title + "' is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println( title + "' has been returned.");
        } else {
            System.out.println( title + "' was not borrowed.");
        }
    }

    @Override
    public String toString() {
        return  title + " by " + author + (isAvailable ? " (Available)" : " (Checked Out)");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add
                (new Book(title, author));
        System.out.println(" Book added: " + title);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println(" No books available in the library.");
            return;
        }
        System.out.println("\n Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println(" Book not found in library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println(" Book not found in library.");
    }
}

public class LibraryManagementSystems {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("(1) Add a Book");
            System.out.println("(2) Display Available Books");
            System.out.println("(3) Borrow a Book");
            System.out.println("(4) Return a Book");
            System.out.println("(5) Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(" Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("✍ Enter author name: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print(" Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print(" Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println(" Exiting Library System. Have a great day!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid option. Please choose again.");
            }
        }
    }
}
