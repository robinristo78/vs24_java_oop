package week4.exercise101.exercise101_3;

//Exercise 101.3: Search functionality

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Search by title (simple contains, case sensitive)
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : books) {
            if (b.title().contains(title)) {
                found.add(b);
            }
        }

        return found;
    }

    // Search by publisher
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : books) {
            if (b.publisher().contains(publisher)) {
                found.add(b);
            }
        }

        return found;
    }

    // Search by year
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : books) {
            if (b.year() == year) {
                found.add(b);
            }
        }

        return found;
    }
}

class Book {
    String title;
    String publisher;
    int year;
    Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return this.title;
    }

    public String publisher() {
        return this.publisher;
    }

    public int year() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}

public class main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        // Search by title
        for (Book book: library.searchByTitle("Cheese")) {
            System.out.println(book);
        }

        System.out.println("---");

        // Search by publisher
        for (Book book: library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");

        // Search by year
        for (Book book: library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
