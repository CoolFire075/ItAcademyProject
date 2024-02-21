package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandomTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int [] array = new int[100];

        System.out.println("Input the smallest number:");
        int min = sc.nextInt();
        System.out.println("Input the biggest number:");
        int max = sc.nextInt();

        for (int i = 0; i < array.length ; i++){
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
