package Procedures;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class functionTaskCurrency {
    public static void main(String[] args) {
        while (true) {
            String currency = showInputDialog("Input your currency (USD , EUR , RUB , KZT)");
            double currencyRate = getCurrentCurrencyRate(currency);
            showMessageDialog(null, currencyRate);
        }
        }
        static double getCurrentCurrencyRate (String currencyCode){
            double rate;
            switch (currencyCode.toUpperCase()) {
                //toUpperCase - делает все буквы большими
                case "USD":
                    rate = 89.4;
                    break;
                case "EUR":
                    rate = 96.4;
                    break;
                case "RUB":
                    rate = 0.975;
                    break;
                case "KZT":
                    rate = 0.1390;
                    break;
                default:
                    throw new Error("Введите один из данных валют ");
//showConfirmDialog( null, "согласны ли вы?")
            }
            return rate;
        }
    }

