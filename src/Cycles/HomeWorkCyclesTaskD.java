package Cycles;

import java.util.Scanner;

public class HomeWorkCyclesTaskD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите диапазон: ");
        int num = sc.nextInt();
        int secondNumber = sc.nextInt();
        int num2 = num;

        if (num % 2 == 1) {
            do {
                System.out.println(num);
                num = num + 2;
                num2 += num;
            }
            while (num <= secondNumber - 2);
            System.out.println(num);
            System.out.println("Сумма нечётных чисел в диапазоне: " + num2);

        } else {
            num = num + 1;
            do {
                System.out.println(num);
                num = num + 2;
                num2 += num;
            }
            while (num <= secondNumber - 2);
            System.out.println(num);
            System.out.println("Сумма нечётных чисел в диапазоне: " + num2 + 1);
        }
    }
}
