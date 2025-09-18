package week4.exercise75.exercise75_1;

//Exercise 75: Decreasing counter
//Exercise 75.1: Implementing method decrease()

import week4.exercise75.DecreasingCounter.DecreasingCounter;

public class main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
