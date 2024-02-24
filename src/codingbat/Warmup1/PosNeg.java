package codingbat.Warmup1;

public class PosNeg {
    public static void main(String[] args) {
        int a = -2;
        int b = 2;
        boolean negative = true;
        boolean isNumberTrue = posNeg(a, b, negative);
        System.out.println(isNumberTrue);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        return (a > 0 && b < 0 || a < 0 && b > 0);
    }
}
