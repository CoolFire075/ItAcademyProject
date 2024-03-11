package Constructors;

public class CircleTask2 {
    double radius;
    String colour;
    boolean isCircleTransparent = false;

    public CircleTask2(double radius){
        this.radius = radius;
    }
    public CircleTask2(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public CircleTask2(double radius, String colour, boolean isCircleTransparent){
        this.radius = radius;
        this.colour = colour;
        this.isCircleTransparent = isCircleTransparent;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){return radius;}
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
