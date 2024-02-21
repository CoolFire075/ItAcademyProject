package NestedLoops;

public class NestedLoopsTask2 {
    public static void main(String[] args) {
        int count = 0, box15kg = 15, box17kg = 17, box21kg = 21, applesAmount = 185, sum;
        for (int kg15multiplier = 0; box17kg * kg15multiplier <= applesAmount; kg15multiplier++) {
            for (int kg17multiplier = 0; box17kg * kg17multiplier <= applesAmount; kg17multiplier++) {
                for (int kg21multiplier = 0; box21kg * kg21multiplier <= applesAmount; kg21multiplier++) {
                    sum = box15kg * kg15multiplier + box17kg * kg17multiplier + box21kg * kg21multiplier;
                    if (sum == applesAmount) {
                        count++;
                        System.out.println("Way number " + count + ": ");
                        System.out.println("15 count: " + kg15multiplier + "; 17 count: " + kg17multiplier + "; 21 count: " + kg21multiplier);
                        System.out.println("Sum: " + sum);
                        break;
                    }
                }
            }
        }
    }
}