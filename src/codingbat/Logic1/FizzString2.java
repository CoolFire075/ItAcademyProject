package codingbat.Logic1;

public class FizzString2 {
    public static void main(String[] args) {
        String str = fizzString2(27);
        System.out.println(str);
    }
    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        } else if (n % 3 == 0){
            return "Fizz!";
        } else if (n % 5 == 0){
            return "Buzz!";
        } return n + "!";
    }
}
