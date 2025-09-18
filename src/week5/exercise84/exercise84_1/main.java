package week5.exercise84.exercise84_1;

//Exercise 84: Overloaded counter
//Exercise 84.1: Multiple constructors

import week5.exercise84.Counter.Counter;

public class main {
    public static void main(String[] args) {
        Counter c1 = new Counter(10, true);
        Counter c2 = new Counter(5);
        Counter c3 = new Counter(true);
        Counter c4 = new Counter();

        c1.decrease();
        c2.increase();
        c3.decrease();
        c4.increase();

        System.out.println("c1: " + c1.value()); // 9
        System.out.println("c2: " + c2.value()); // 6
        System.out.println("c3: " + c3.value()); // 0
        System.out.println("c4: " + c4.value()); // 1
    }
}
