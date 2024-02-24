package codingbat.Warmup1;

public class NearHundred {
    public static void main(String[] args) {
        int n = 111;
        boolean isNumberNearHundred = nearHundred(n);
        System.out.println(isNumberNearHundred);
    }
    public static boolean nearHundred(int n) {
         return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }

}
