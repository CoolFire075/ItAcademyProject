package codingbat.Logic1;

public class TwoAsOne {
    public static void main(String[] args) {
        boolean isSumNumbersEquallyNum = twoAsOne(3, 5,8);
        System.out.println(isSumNumbersEquallyNum);
    }
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}
