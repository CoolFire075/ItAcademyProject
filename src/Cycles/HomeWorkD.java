package Cycles;

import java.util.Scanner;

public class HomeWorkD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Write third number: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("Все числа одинаковые ");
        } else if (firstNumber == secondNumber) {
            System.out.println("Два числа одинаковые ");
        } else if (firstNumber == thirdNumber) {
            System.out.println("Два числа одинаковые ");
        } else if (thirdNumber == secondNumber) {
            System.out.println("Два числа одинаковые ");
        } else {
            System.out.println("Нет одинаковых чисел ");
        }


    }
}
