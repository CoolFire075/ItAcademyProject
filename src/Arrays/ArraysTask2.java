package Arrays;

import java.util.Random;

public class ArraysTask2 {
    public static void main(String[] args) {
        Random random = new Random();

    int sum = 0;
    int size = 10;
    int [] numbers = new int[size];
    for ( int i = 0; i < numbers.length ; i++){
        numbers[i] = random.nextInt(101);
        System.out.println(" Random number №" + i + ": " + numbers[i]);
        sum += numbers[i];
    }
        float average = (float) sum/size;
        System.out.printf("The arithmetic mean of numbers = %.2f " , average) ;
    }
}
