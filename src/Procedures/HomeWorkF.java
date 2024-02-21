package Procedures;

import java.util.Scanner;

public class HomeWorkF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = sc.nextInt();
        int dec = age % 100;

         if (dec >= 11 && dec <= 15){
             System.out.println("Вам " + age + " лет");
         } else if (age % 10 >= 2 && age % 10 <= 4 ){
            System.out.println("Вам " + age + " года");
        }else if (age % 10 == 1){
            System.out.println("Вам " + age + " год");
        }
        else {
            System.out.println("Вам " + age + " лет");
        }

    }
}
