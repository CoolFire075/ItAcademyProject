package Matrix;

import java.util.Random;

public class MatrixTask1 {
    public static void main(String[] args) {
        Random random = new Random();

        int rowsAmount = 4, columnsAmount = 4, sum = 0;
        int[][] matrix = new int[rowsAmount][columnsAmount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(256);
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        float valueAverage = (float) sum / (rowsAmount * columnsAmount);
        System.out.println("Average value = " + valueAverage);
        System.out.println("Result:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < valueAverage) matrix[i][j] = 0;
                else matrix[i][j] = 255;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}