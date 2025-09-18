package week4.exercise75.exercise75_3;

//Exercise 75: Decreasing counter
//Exercise 75.3: Counter reset

import week4.exercise75.DecreasingCounter.DecreasingCounter;

public class main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
