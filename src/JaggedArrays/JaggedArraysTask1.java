package JaggedArrays;

import java.util.Random;

public class JaggedArraysTask1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[random.nextInt(20)][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int [random.nextInt(6)];
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
