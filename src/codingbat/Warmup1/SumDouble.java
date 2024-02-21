package codingbat.Warmup1;

public class SumDouble {
    public static void main(String[] args) {
        int twoNumbersSum = sumDouble(5,7);
    }
    public static int sumDouble(int a, int b) {
        if (a == b)
            return 2 * (a + b);
        return a + b;
    }
}
