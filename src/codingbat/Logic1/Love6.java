package codingbat.Logic1;

public class Love6 {
    public static void main(String[] args) {
        boolean isNumber6 = love6(6, 8);
        System.out.println(isNumber6);
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        else if (Math.abs(a - b) == 6 || Math.abs(b - a) == 6)
            return true;
        else return a + b == 6;
    }
}
