package codingbat.Logic1;

public class AnswerCell {
    public static void main(String[] args) {
        boolean isCellAnswer = answerCell(true, true, false);
        System.out.println(isCellAnswer);
    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            return isMom;
        }  return true;
    }
}
