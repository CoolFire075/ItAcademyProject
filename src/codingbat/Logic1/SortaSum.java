package codingbat.Logic1;

public class SortaSum {
    public static void main(String[] args) {
        int sum = sortaSum(12, 7);
        System.out.println(sum);

    }

    public static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        else return a + b;
    }
}
