package week5.exercise86.exercise86_3;

//Exercise 86: Lyyra card and Cash Register
//Exercise 86.3: Paying with card

import week5.exercise86.CashRegister.CashRegister;
import week5.exercise86.LyyraCard.LyyraCard;

public class main {
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println(unicafeExactum);
    }
}
