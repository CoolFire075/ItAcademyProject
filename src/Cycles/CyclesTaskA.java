package Cycles;

import java.util.Enumeration;
import java.util.Scanner;

public class CyclesTaskA {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        while (true){
        System.out.println("Input first less number:");
        int A = number.nextInt();
        System.out.println("Input second bigger number:");
        int B = number.nextInt();


            while (0 < A && A <= B) {
                double pow = Math.pow(A, 2);
                System.out.println(A + " * " + A + " = " + pow);
                A++;
            }
        }


    }
}
