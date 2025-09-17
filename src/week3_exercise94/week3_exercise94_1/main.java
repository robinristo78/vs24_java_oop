package week3_exercise94.week3_exercise94_1;

//Exercise 94.1: Person

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

public class main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);
    }
}
