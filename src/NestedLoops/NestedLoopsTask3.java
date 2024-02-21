package NestedLoops;

import java.util.Scanner;

public class NestedLoopsTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of your array: ");
        int arraySize = sc.nextInt();
        findBiggestAndSmallestNumbers(arraySize);
    }

    public static void findBiggestAndSmallestNumbers(int arraySize) {
        Scanner sc = new Scanner(System.in);
        int i, biggestNumber = 0, biggestNumbersAmount = 0, smallestNumber = 10, smallestNumbersAmount = 0;
        System.out.println("Input size of your array: ");
        int[] array = new int[arraySize];
        for (i = 0; i < arraySize; i++) {
            System.out.println("Input number:");
            array[i] = sc.nextInt();
            System.out.println("Num number (" + (i + 1) + ") = " + array[i]);
        }
        for (i = 0; i < arraySize; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
                biggestNumbersAmount = 1;
            } else if (array[i] == biggestNumber) {
                biggestNumbersAmount++;
            }
            if (array[i] < smallestNumber){
                smallestNumber = array[i];
                smallestNumbersAmount = 1;
            } else if (array[i] == smallestNumber){
                smallestNumbersAmount++;
            }
        }
        System.out.println("Biggest number: " + biggestNumber);
        System.out.println("Amount of biggest number: " + biggestNumbersAmount);
        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Amount of smallest number: " + smallestNumbersAmount);

    }
}