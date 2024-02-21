package codingbat.Warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        boolean haveWeProblems = monkeyTrouble(true , false);
        System.out.println(haveWeProblems);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile)
            return true;
        return false;

    }
}
