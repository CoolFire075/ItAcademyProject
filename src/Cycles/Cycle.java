package Cycles;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your number: ");
        long number = sc.nextLong();
        long count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

    }
}
