package ClassesAndObjects;

public class RectangleTask1 {
    public static void main(String[] args) {
        Rectangle firstObject = new Rectangle();
        firstObject.length = 30.0;
        firstObject.width = 15.0;
        System.out.println("Length of rectangle: " + firstObject.length
                + "\nWidth of rectangle: " + firstObject.width
                + "\nSquare of rectangle: " + firstObject.getSquare());

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.setLength(10.0);
        secondRectangle.setWidth(2.0);
        System.out.println("\nLength of rectangle: " + secondRectangle.length
                + "\nWidth of rectangle: " + secondRectangle.width
                + "\nSquare of rectangle: " + secondRectangle.getSquare());
    }
}
