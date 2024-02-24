package codingbat.Warmup1;

import java.util.Scanner;

public class Makes10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = sc.nextInt();
        System.out.println("Input first number:");
        int b = sc.nextInt();
        boolean isNumberEqually10 = makes10(a, b);
        System.out.println(isNumberEqually10);
    }
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
