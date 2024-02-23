package codingbat.Warmup1;

import java.util.Scanner;

public class Diff21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int difference21 = diff21(n);
        System.out.println(difference21);
    }

    public static int diff21(int n) {
        if (n > 21) {
            n = (n - 21) * 2;
        } else n = n - 21;
        Math.abs(n);

        return n;
    }
}
