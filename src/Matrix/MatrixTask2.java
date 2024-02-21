package Matrix;

import java.util.Random;

public class MatrixTask2 {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsAmount = 3, columnAmount = 3, sum = 0;
        int[][] matrix = new int[rowsAmount][columnAmount];

        for (int i = 0; i < rowsAmount; i++) {
            for (int j = 0; j < columnAmount; j++) {
                matrix[i][j] = random.nextInt(100);
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        float valueAverage = (float) sum / (rowsAmount * columnAmount);
        System.out.println("Average value = " + valueAverage);
    }
}