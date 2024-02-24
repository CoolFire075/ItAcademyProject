package codingbat.Warmup1;

import java.util.Scanner;

public class ParrotTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        boolean talking = true;
        boolean haveWeProblem = parrotTrouble(talking, hour);
        System.out.println(haveWeProblem);
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {
            return hour < 7 || hour > 20;
        } return false;
    }
}
