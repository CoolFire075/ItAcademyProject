package Matrix;

import java.util.Random;

public class MatrixTask3 {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsAmount = 4, columnAmount = 4, randomSize = 256, numberMax = 0, maxElementRow = 0, maxElementColumn = 0,
                numberMin = randomSize, minElementRow = 0, minElementColumn = 0;
        int[][] matrix = new int[rowsAmount][columnAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnAmount; j++) {
                matrix[i][j] = random.nextInt(randomSize);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnAmount; j++) {
                if (matrix[i][j] > numberMax) {
                    numberMax = matrix[i][j];
                    maxElementRow = i;
                    maxElementColumn = j;
                }

                if (matrix[i][j] < numberMin) numberMin = matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
                minElementRow = i;
                minElementColumn = j;
            }
            System.out.println();
        }
        System.out.println("Maximum element Matrix[" + maxElementRow + "][" + maxElementColumn + "] = " + numberMax);
        System.out.println("Minimum element Matrix[" + minElementRow + "][" + minElementColumn + "] = " + numberMin);
    }
}