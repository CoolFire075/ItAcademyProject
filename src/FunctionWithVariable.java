public class FunctionWithVariable {
    public static void main(String[] args) {
        calculateSum(1, 2, 3);
        calculateSum(1, 3, 4, 8, 11);
        calculateSum(5, 8, 6, 13, 18, 22, 42);
        calculateSum(1, 6, 12, 24, 33, 53, 57, 75, 35, 79);
    }

    public static void calculateSum(int... nums) {
        int sum = 0;
        for (int i : nums){
            if (i % 2 == 0) continue;
            int pow = i * i;
            sum += pow;
        }
        System.out.println("Amount of numbers: " + nums.length + ";\t  sum of numbers: " + sum);
    }
}
