package week2.week2_exercise29;

//Exercise 29: Even numbers

public class main {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100) {
            i++;

            //For readability:
            if (i % 10 == 0) {
                System.out.println();
            }

            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
