package codingbat.Logic1;
public class LastDigit {
    public static void main(String[] args) {
        int a = 23;
        int b = 13;
        int c = 3;
        boolean areNumbersSimilar = lastDigit(a, b, c);
        System.out.println(areNumbersSimilar);
    }
    public static boolean lastDigit(int a, int b, int c){
        return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
    }
}