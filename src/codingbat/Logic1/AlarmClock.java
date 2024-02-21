package codingbat.Logic1;

public class AlarmClock {
    public static void main(String[] args) {
        String alarmTime = alarmClock(0, false);
        System.out.println("Alarm time: " + alarmTime);

    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
            return "off";
        } else
            if (day == 0 || day == 6) {
            return "10:00";
        }
            return "7:00";
    }
}
