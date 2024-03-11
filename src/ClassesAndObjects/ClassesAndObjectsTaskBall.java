package ClassesAndObjects;

public class ClassesAndObjectsTaskBall {
    public static void main(String[] args) {
        Ball myRedBall = new Ball();
        myRedBall.ballColour = "Red";
        myRedBall.ballSize = 22.5;
        myRedBall.productionCountry = "China";
        System.out.println(" Colour of my ball \t - " + myRedBall.ballColour
        + "\n Size of my ball \t - " + myRedBall.ballSize
        + "\n Country where ball was produced \t - " + myRedBall.productionCountry);
    }
}
