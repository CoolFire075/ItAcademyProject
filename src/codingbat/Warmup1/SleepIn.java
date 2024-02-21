package codingbat.Warmup1;

public class SleepIn {
    public static void main(String[] args) {
        boolean isSleeping = sleepIn(false, true);

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && vacation)
            return true;
        else if (vacation)
            return true;
        else if (!weekday)
            return true;
        else return false;
    }

}
