package week2.week2_exercise26;

//Exercise 26: Sum of many numbers

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a number:");

        while(true){
            System.out.print("+ ");
            int read = Integer.parseInt(reader.nextLine());
            if(read == 0){
                break;
            }

            sum += read;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}
