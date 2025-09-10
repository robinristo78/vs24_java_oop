package week1_chapter9;
//Introduction to loops

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to the calculator");

        while (true) {
            System.out.print("Enter a command (sum, difference, quit): ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            }

            System.out.print("enter the numbers:\n");
            int first = Integer.parseInt(reader.nextLine());
            switch (command) {
                case "sum":
                    System.out.print("+\n");
                    break;
                case "difference":
                    System.out.print("-\n");
                    break;
            }
            int second = Integer.parseInt(reader.nextLine());

            if (command.equals("sum") ) {
                int sum = first + second;
                System.out.println( "The sum of the numbers is " + sum );
            } else if (command.equals("difference")) {
                int difference = first - second;
                System.out.println("The difference of the numbers is " + difference);
            } else {
                System.out.println("Unknown command");
            }

        }

        System.out.println("Thanks, bye!");

        System.out.println("Thank you and see you later!");
    }
}
