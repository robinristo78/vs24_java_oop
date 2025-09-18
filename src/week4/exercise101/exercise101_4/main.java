package week4.exercise101.exercise101_4;

//Exercise 101.3: Search functionality

import java.util.ArrayList;

class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        // Clean both strings
        word = word.toUpperCase();
        searched = searched.trim().toUpperCase();

        return word.contains(searched);
    }
}

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

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : books) {
            if (StringUtils.included(b.title(), title)) {
                found.add(b);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();

        for (Book b : books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }

        return found;
    }

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

        // Case-insensitive title search
        for (Book book: library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");

        // Publisher search with extra spaces
        for (Book book: library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}
