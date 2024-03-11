package Constructors;

public class Circle {
    double radius;
    String colour;
    boolean isCircleTransparent = false;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public  Circle(double radius, String colour, boolean isCircleTransparent){
        this.radius = radius;
        this.colour = colour;
        this.isCircleTransparent = isCircleTransparent;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    public double getSquare(){
        return 3.14 * radius * radius;
    }

    public String getColour(){
        return colour;
    }
    public boolean getIsCircleTransparent(){
        return isCircleTransparent;
    }
}
