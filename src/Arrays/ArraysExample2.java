package Arrays;

import java.util.Scanner;

public class ArraysExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int [] numbers = new int[size];

        for (int i = 0; i < size ; i++){
            System.out.println("numbers[" + i + "] = ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array numbers: ");
        for (int i = 0; i < size; i++){
            System.out.println(numbers[i] + " ");
        }
    }
}
