package codingbat.Logic1;

public class Old35 {
    public static void main(String[] args) {
        boolean isNumberMultiple3Or5 = old35(34);
        System.out.println(isNumberMultiple3Or5);
    }
    public static boolean old35(int n) {
        return n % 3 != 0 && n % 5 == 0 || n % 3 == 0 && n % 5 != 0;
    }
}
