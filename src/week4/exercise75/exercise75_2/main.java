package week4.exercise75.exercise75_2;

//Exercise 75: Decreasing counter
//Exercise 75.2: Value remains positive

import week4.exercise75.DecreasingCounter.DecreasingCounter;

public class main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
