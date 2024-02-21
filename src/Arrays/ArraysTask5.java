package Arrays;

import java.util.Random;

public class ArraysTask5 {
    public static void main(String[] args) {
        int size = 6;
        int[] randomNumbers = createRandomNumbers(size);
        System.out.println(randomNumbers);
        int similarNumbers = findSimilarNumbers(size, randomNumbers);
        System.out.println(similarNumbers);
    }

    public static int[] createRandomNumbers(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        int i;

        for (i = 0; i < size - 1; i++) {
            numbers[i] = random.nextInt(3);
            System.out.print(numbers[i]);
        }
        for (i = 0; i < size - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                System.out.println();
                System.out.println("there is: " + numbers[i]);
                break;
            }

        }
        return numbers;
    }


    public static int findSimilarNumbers(int size, int[] randomNumbers) {


        System.out.println("There are not similar numbers");
//        return numbers[i];
        return 0;
    }
}
