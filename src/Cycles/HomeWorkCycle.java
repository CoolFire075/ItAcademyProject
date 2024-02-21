package Cycles;

import java.util.Scanner;

public class HomeWorkCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first factor: ");
        int firstFactor = sc.nextInt();
        System.out.println("Input second factor: ");
        int secondFactor = sc.nextInt();
        int secondFactor2 = Math.abs(secondFactor);
        int firstFactor2 = Math.abs(firstFactor);
        int count = 0;
        int result = 0;

        while (count != secondFactor2) {
            result += firstFactor2;
            count++;
        }
        if (firstFactor < 0 && secondFactor < 0) {
            System.out.println(result);
        } else if (firstFactor < 0 || secondFactor < 0) {
            System.out.println(-result);
        }else {
            System.out.println(result);
        }
    }

}

