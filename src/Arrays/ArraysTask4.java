package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input your number from 0 till 5 : ");
        int number = sc.nextInt();
        int nX = -1;
        int count = 0;
        int i = 0;
        System.out.print("Found: ");
        int[] numbers = new int[100];
        for (; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
            nX++;
            if (numbers[i] == number) {
                count++;
                System.out.print("A[" + nX + "] = " + numbers[i]);
                break;
            }
            System.out.print("A[" + nX + "] = " + numbers[i]);
            for (; i < numbers.length; i++) {
                numbers[i] = random.nextInt(6);
                nX++;
                if (numbers[i] == number) {
                    count++;
                    System.out.print(", A[" + nX + "] = " + numbers[i]);
                }
            }
            System.out.println();
            System.out.print("Founded numbers[" + number + "] amount = " + count);
        }
    }
}