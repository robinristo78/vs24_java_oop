package week5.exercise86.CashRegister;

import week5.exercise86.LyyraCard.LyyraCard;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double price = 2.50;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.economicalSold++;
            return cashGiven - price;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double price = 4.00;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.gourmetSold++;
            return cashGiven - price;
        } else  {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.50;
        if (card.pay(price)) {
            this.economicalSold++;
            return true;
        } else  {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4.00;
        if (card.pay(price)) {
            this.gourmetSold++;
            return true;
        }  else  {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
