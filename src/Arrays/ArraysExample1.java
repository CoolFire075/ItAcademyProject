package Arrays;

import java.util.Scanner;

public class ArraysExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of array");
        int size = sc.nextInt();
        int [] numbers = new int[size];

        for(int i = 0; i < size; i++){
            numbers[i] = 2 * i ;
            System.out.println(numbers[i]);
        }
    }
}
