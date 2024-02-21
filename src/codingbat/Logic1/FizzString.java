package codingbat.Logic1;

public class FizzString {
    public static void main(String[] args) {
        String isWordTrue = fizzString("farm");
        System.out.println(isWordTrue);
    }
    public static String fizzString(String str) {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()- 1);
        if (firstChar == 'f' && lastChar == 'b' ){
            return "FizzBuzz";
        } else if (firstChar == 'f'){
            return "Fizz";
        } else if (lastChar == 'b'){
            return "Buzz";
        }
        return str;
    }
}
