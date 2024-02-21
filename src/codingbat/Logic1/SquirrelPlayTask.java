package codingbat.Logic1;

public class SquirrelPlayTask {
    public static void main(String[] args) {
        boolean isSquirrelPlaySucessful = squirrelPlay(95, true);
        System.out.println(isSquirrelPlaySucessful);
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) return (temp >= 60 && temp <= 100);
        return (temp >= 60 && temp <= 90);
    }
}
