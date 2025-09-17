package week3_exercise101.week3_exercise101_2;

//Exercise 101.2: Library

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

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        library.addBook(nhl);

        library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        library.printBooks();
    }
}
