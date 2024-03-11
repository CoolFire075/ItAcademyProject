package ClassesAndObjects;

public class ClassesAndObjectsTaskCar {
    public static void main(String[] args) {
        Car myCamry = new Car();
        myCamry.carBrand = "Toyota";
        myCamry.carModel = "Camry";
        myCamry.colour = "White";
        myCamry.productionYear = 2002;
        System.out.println(" Brand of car - " + myCamry.carBrand
        + "\n Model of car - " + myCamry.carModel
        + "\n Colour of car - " + myCamry.colour
        + "\n Year of production - " + myCamry.productionYear);

        Car my4Runner = new Car();
        my4Runner.carBrand = "Toyota";
        my4Runner.carModel = "4Runner";
        my4Runner.colour = "Blue";
        my4Runner.productionYear = 2015;
        System.out.println("\n Brand of car - " + my4Runner.carBrand
                + "\n Model of car - " + my4Runner.carModel
                + "\n Colour of car - " + my4Runner.colour
                + "\n Year of production - " + my4Runner.productionYear);

        Car myTesla = new Car();
        myTesla.carBrand = "Tesla";
        myTesla.carModel = "Modes S Plaid";
        myTesla.colour = "Black";
        myTesla.productionYear = 2020;
        System.out.println("\n Brand of car - " + myTesla.carBrand
                + "\n Model of car - " + myTesla.carModel
                + "\n Colour of car - " + myTesla.colour
                + "\n Year of production - " + myTesla.productionYear);
    }
}
