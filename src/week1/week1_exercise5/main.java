package week1.week1_exercise5;

//Exercise 5: Seconds in a year.

import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        int seconds_in_year = 60 * 60 * 24 * 365;

        DecimalFormat df = new DecimalFormat("#,###");
        String formatted = df.format(seconds_in_year);

        System.out.println("There are " + formatted + " seconds in a year");
    }
}
