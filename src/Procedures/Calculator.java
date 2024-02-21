package Procedures;

import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Calculator {
    public static void main(String[] args) {
        showMessageDialog(null, "Error");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Input second number: ");
        double num2 = sc.nextDouble();
        double result = 0;
        System.out.println("Input your action: ");
        String operation = sc.next();
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0){
                    showMessageDialog(null, "Error");
                }
                result = num1 / num2;
                break;
                default:
                    showMessageDialog(null, "Error");
                    System.out.println("Error");

        }
        System.out.println("Result of action:" + result);
    }
}
