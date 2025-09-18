package week4.exercise75.exercise75_4;

//Exercise 75: Decreasing counter
//Exercise 75.4: Back to initial value

import week4.exercise75.DecreasingCounter.DecreasingCounter;

public class main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
