package week5.exercise86.exercise86_1;

//Exercise 86: Lyyra card and Cash Register
//Exercise 86.1: The "stupid" Lyyra card

import week5.exercise86.LyyraCard.LyyraCard;

public class main {
    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );
    }
}
