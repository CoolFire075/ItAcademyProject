package codingbat.Logic1;

public class Less20 {
    public static void main(String[] args) {
        boolean isNumberLess20 = less20(18);
        System.out.println(isNumberLess20);
    }
    public static boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }
}
