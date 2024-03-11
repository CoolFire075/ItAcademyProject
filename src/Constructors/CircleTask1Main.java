package Constructors;

import java.util.Scanner;

public class CircleTask1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle myCircle = new Circle(3,"black", true );
        System.out.println("Perimeter: " + myCircle.getPerimeter() +
                "\nSquare: " + myCircle.getSquare() +
                "\nColour: " + myCircle.getColour() +
                "\nTransparent: " + myCircle.getIsCircleTransparent());
    }
}
