package week4.exercise94.exercise94_2;

//Exercise 94.2: Adding persons to Phonebook

import java.util.ArrayList;  // make sure this is at the top of your file

class Person {
    String name;
    String number;
    Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return name + "  number: " + number;
    }
}

class Phonebook {
    private ArrayList<Person> persons;

    public Phonebook() {
        this.persons = new ArrayList<>();
    }

    // Adds a new Person
    public void add(String name, String number) {
        this.persons.add(new Person(name, number));
    }

    // Prints all persons
    public void printAll() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

public class main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();
    }

}
