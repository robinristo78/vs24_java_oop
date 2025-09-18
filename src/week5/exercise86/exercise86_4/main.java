package week5.exercise86.exercise86_4;

//Exercise 86: Lyyra card and Cash Register
//Exercise 86.4: Loading money

import week5.exercise86.CashRegister.CashRegister;
import week5.exercise86.LyyraCard.LyyraCard;

public class main {
    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
