package codingbat.Logic1;

public class In1To10 {
    public static void main(String[] args) {
        boolean isNumberTrue = in1To10(1 , true);
        System.out.println(isNumberTrue);
    }
    public static boolean in1To10(int n, boolean outsideMode) {
       if (!outsideMode){
          return n >= 1 && n <= 10;
       } return n != 9;

    }
}
