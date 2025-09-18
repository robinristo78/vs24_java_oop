package week5.exercise84.exercise84_2;

//Exercise 84: Overloaded counter
//Exercise 84.2: Alternative methods

import week5.exercise84.Counter.Counter;

public class main {
    public static void main(String[] args) {
        Counter c = new Counter(10, true);

        c.increase(-5);   // value = 10 (If the value of the parameter is negative, the value will not change.)
        c.decrease(20);  // value: (10 - 20) == 0 (check = true)

        Counter c2 = new Counter(2, false);
        c2.increase(3);
        c2.decrease(8);  // value: (5 - 8) == -3 (check = false)

        System.out.println("c: " + c.value());   // 0
        System.out.println("c2: " + c2.value()); // -3
    }
}
