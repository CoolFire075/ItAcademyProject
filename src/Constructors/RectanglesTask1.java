package Constructors;

public class RectanglesTask1 {
    double length;
    double width;

    public RectanglesTask1(double l, double w) {
        if (l > 0 && w > 0) {
            length = l;
            width = w;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}