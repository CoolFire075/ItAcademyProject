package Constructors;

import java.util.Random;

public class Circles100 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100, count = 0;
        int [] circle = new int [size];
        int [] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
            System.out.println("Array number[" + i + "] = " + array[i]);
            if (array[i] % 3 == 0){
                circle[count] = array[i];
                count++;
                System.out.println("Count number[" + count + "] = " + circle[count]);
            }
        }
    }
}
