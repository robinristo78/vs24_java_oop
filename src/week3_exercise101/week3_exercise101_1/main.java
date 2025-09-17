package week3_exercise101.week3_exercise101_1;

//Exercise 101.1: Book

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
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);
    }
}
