package Cycles;

import java.util.Scanner;

public class HomeWorkB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int a2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int a3 = sc.nextInt();
        System.out.println("Введите четвёртое число: ");
        int a4 = sc.nextInt();
        System.out.println("Введите пятое число: ");
        int a5 = sc.nextInt();

        if (a1 == a2 & a1 == a3 & a1 == a4 & a1 == a5) {
            System.out.println( "Все числа равны");
        } else if (a1 >= a2 && a1 >= a3 && a1 >= a4 && a1 >= a5) {
            System.out.println(a1 + " Самое большое число");
        } else if (a2 >= a1 && a2 >= a3 && a2 >= a5) {
            System.out.println(a2 + " Самое большое число");
        } else if (a3 >= a1 && a3 >= a2 && a3 >= a4 && a3 >= a5) {
            System.out.println(a3 + " Самое большое число");
        } else if (a4 >= a1 && a4 >= a2 && a4 >= a3 && a4 >= a5) {
            System.out.println(a4 + " Самое большое число");
        } else if (a5 >= a4) {
            System.out.println(a5 + " Самое большое число");
        }
    }
}
