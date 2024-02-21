package codingbat.Logic1;

public class SpecialEleven {
    public static void main(String[] args) {
        boolean isNumberSpecial = specialEleven(23);
        System.out.println(isNumberSpecial);
    }
    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}
