package Procedures;

public class Average {
    public static void main(String[] args) {
        calculateAverage(12, 24);
        calculateAverage(19, 41);
    }
    static void calculateAverage(int num1 , int num2){
        int average = (num1 + num2) / 2;
        System.out.println("Average:" + "(" + num1 + " + " + num2 + ")" + " / " + 2 + " = " + average);
    }
}
