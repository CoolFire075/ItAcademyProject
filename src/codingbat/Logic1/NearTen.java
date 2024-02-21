package codingbat.Logic1;

public class NearTen {
    public static void main(String[] args) {
        boolean isNumber10Near = nearTen(21);
        System.out.println(isNumber10Near);
    }
    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
