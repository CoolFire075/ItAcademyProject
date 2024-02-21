package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysTask4Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input your number from 0 till 5 : ");
        int number = sc.nextInt();
        int i;
        int count = 0;
        System.out.print("Found: ");
        int size = 5;
        int[] numbers = new int[size];

        for (i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(6);

        for (i = 0; i < numbers.length; i++) {
            count++;
            if (numbers[i] == number) {
                System.out.print(" A[" + count + "] = " + numbers[i]);
                i++;
                break;
            }
        }
        for ( ; i < numbers.length; i++) {
            count++;
            if (numbers[i] == number) {
                System.out.print(", A[" + count + "] = " + numbers[i]);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
