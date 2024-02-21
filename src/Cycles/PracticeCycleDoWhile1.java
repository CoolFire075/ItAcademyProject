package Cycles;

import java.util.Scanner;

public class PracticeCycleDoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your number: ");
        int number = sc.nextInt();
        int number2 ;
        int number3 ;
        boolean hasNearNums = false;
        do {
            number2 = number % 10;
            number3 = number % 100 / 10;
            System.out.println("number2 = " + number2 + "number3 = " + number3);
            number = number / 10;
            if (number2 == number3) {
                hasNearNums = true;
                break ;
            }

        }
        while (number != 0) ;
        if (hasNearNums){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
