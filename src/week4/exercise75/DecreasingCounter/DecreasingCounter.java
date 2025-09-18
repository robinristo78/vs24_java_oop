package week4.exercise75.DecreasingCounter;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int valueAtStart;

    public DecreasingCounter(int valueAtStart) {
        this.valueAtStart = valueAtStart;
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if (this.value > 0) this.value--;
    }

    // and here the rest of the methods

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = valueAtStart;
    }
}