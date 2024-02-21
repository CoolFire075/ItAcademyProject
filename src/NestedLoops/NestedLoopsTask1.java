package NestedLoops;

import java.util.Scanner;

public class NestedLoopsTask1 {
    public static void main(String[] args) {
        getSimpleNumber();
    }

    public static void getSimpleNumber() {
        Scanner sc = new Scanner(System.in);
        boolean isSimpleNumber = true;
        System.out.println("Input less number: ");
        int lessNumber = sc.nextInt();
        System.out.println("Input bigger number: ");
        int biggerNumber = sc.nextInt();
        for (int number = lessNumber; number <= biggerNumber; number++) {

            for (int divider = 2; divider < number; divider++) {
                isSimpleNumber = true;
                if (number % divider == 0) {
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) {
                System.out.println("Simple number: " + number);
            }
        }
    }
}
