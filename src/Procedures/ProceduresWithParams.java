package Procedures;

import java.util.Scanner;

public class ProceduresWithParams {
    public static void main(String[] args) {
        printSumOfNumbers();
        printSumOfNumbers();

    }
    static void printSumOfNumbers(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Sum: " + sum);
    }
}
