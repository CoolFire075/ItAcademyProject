package codingbat.Logic1;

public class More20 {
    public static void main(String[] args) {
        boolean isNumberMore20 = more20(21);
        System.out.println(isNumberMore20);

    }
    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }
}
