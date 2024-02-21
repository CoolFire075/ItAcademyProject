package Arrays;

import java.util.Random;

public class ArraysTask3 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int littleNumbersSum = 0;
        int bigNumbersSum = 0;
        int littleNumbersCount = 0;
        int bigNumbersCount = 0;

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
            System.out.println(" Random number №" + i + ": " + numbers[i]);
            if (numbers[i] < 50) {
                littleNumbersSum += numbers[i];
                littleNumbersCount++;
            } else {
                bigNumbersSum += numbers[i];
                bigNumbersCount++;
            }
        }
        float littleNumbersAverage = (float) littleNumbersSum / littleNumbersCount;
        System.out.printf("The arithmetic mean of little numbers = %.2f \n", littleNumbersAverage );
        float bigNumbersAverage = (float) bigNumbersSum / bigNumbersCount;
        System.out.printf("The arithmetic mean of big numbers = %.2f \n ", bigNumbersAverage);
    }
}
