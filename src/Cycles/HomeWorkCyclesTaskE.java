package Cycles;

import java.util.Scanner;

public class HomeWorkCyclesTaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        do {
            System.out.println("Введите число: ");
            number = sc.nextInt();
            sum += number;
                count++;
        } while (number != 0);
        System.out.println("Количество введённых чисел: " + --count);
        System.out.println("Сумма = " + sum);
    }
}
