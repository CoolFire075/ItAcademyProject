package Cycles;

public class CyclesTaskContinue {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (i % 2 == 0) continue;
            System.out.println(i * i);
        }
        for (int i : array) {
            if (i % 2 == 0) continue;
            System.out.println(i * i);
        }
    }
}
