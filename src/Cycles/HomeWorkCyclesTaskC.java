package Cycles;

import java.util.Scanner;

public class HomeWorkCyclesTaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println(" Input your number: ");
        int number = sc.nextInt();
        int count = 1;

        for ( ; count <= 10 ; count++ ){
            System.out.println(number + " * " + count + " = " + number * count);
        }
    }
}
