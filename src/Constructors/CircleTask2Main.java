package Constructors;

import java.util.Scanner;

public class CircleTask2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleTask2 myCircle2 = new CircleTask2(3,"black", true );
        printCircle(myCircle2);

        //CircleTask2 circle2 = new CircleTask2(2,"white");

        CircleTask2 radius2 = new CircleTask2(2);
        myCircle2.setRadius(radius2.radius);
        printCircle(myCircle2);
    }
    public static void printCircle(CircleTask2 myCircle2){
        System.out.println("\nRadius: " + myCircle2.getRadius() +
                "\nPerimeter: " + myCircle2.getPerimeter() +
                "\nSquare: " + myCircle2.getSquare() +
                "\nColour: " + myCircle2.getColour() +
                "\nTransparent: " + myCircle2.getIsCircleTransparent());
    }
}
