package Procedures;

import static javax.swing.JOptionPane.*;

public class HomeWorkExchange {
    public static void main(String[] args) {
        String buyOrSell = showInputDialog(null, "If you want to buy currency , write (1) ; if you want to sell currency , write (2) ");
        int a = Integer.parseInt(buyOrSell);
        double takenAmountOfMoney;
        double costOfCurrency;
        if (a == 1) {
            costOfCurrency = getCostOfPurchaseCurrency();
        } else {
            costOfCurrency = getCostOfSalesCurrency();
        }
        String amountOfMoney = showInputDialog(null, "Input sum of your exchange");
        takenAmountOfMoney = Integer.parseInt(amountOfMoney);
        double totalAmountOfMoney = takenAmountOfMoney * costOfCurrency;
        if (totalAmountOfMoney <= 200000 && a == 1) {
            showMessageDialog(null, "You want to buy " + totalAmountOfMoney + " amount of currency");
        } else if (totalAmountOfMoney <= 200000 && a == 2) {
            showMessageDialog(null, "You want to sell " + totalAmountOfMoney + " amount of currency");
        } else showMessageDialog(null, "We cannot give you so much money");


    }

    public static double getCostOfPurchaseCurrency() {
        double cost = 0;
        String getCostOfCurrency = showInputDialog(null, "Input your currency (USD , EUR , RUB , KZT)");
        switch (getCostOfCurrency.toUpperCase()) {
            case "USD":
                cost = 68;
                break;
            case "EUR":
                cost = 77;
                break;
            case "RUB":
                cost = 0.8;
                break;
            case "KZT":
                cost = 0.25;
                break;
        }
        return cost;

    }

    public static double getCostOfSalesCurrency() {
        double cost = 0;
        String getCostOfCurrency = showInputDialog(null, "Input your currency (USD , EUR , RUB , KZT)");
        switch (getCostOfCurrency.toUpperCase()) {
            case "USD":
                cost = 69;
                break;
            case "EUR":
                cost = 78;
                break;
            case "RUB":
                cost = 1;
                break;
            case "KZT":
                cost = 0.33;
                break;
        }
        return cost;

    }
}
