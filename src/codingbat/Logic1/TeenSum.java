package codingbat.Logic1;

public class TeenSum {
    public static void main(String[] args) {
        int isNumberTeen = teenSum(9, 7);
        System.out.println(isNumberTeen);
    }
    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else return a + b;
    }
}
