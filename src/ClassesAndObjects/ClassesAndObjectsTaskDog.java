package ClassesAndObjects;

public class ClassesAndObjectsTaskDog {
    public static void main(String[] args) {
        Dog myPitBull = new Dog();
        myPitBull.colour = "Black";
        myPitBull.height = 60.5;
        myPitBull.weight = 30.0;
        myPitBull.breed = "Pit bull";
        System.out.println("  Colour of my pit bull - " + myPitBull.colour
                + "\n  Height of my pit bull = " + myPitBull.height
                + "\n  Weight of my pit bull = " + myPitBull.weight
                + "\n  Breed of my pit bull  - " + myPitBull.breed);

        Dog myDachshund = new Dog();
        myDachshund.colour = "Brown";
        myDachshund.height = 30.5;
        myDachshund.weight = 17.5;
        myDachshund.breed = "Dachshund";
        System.out.println("\n \n  Colour of my dachshund - " + myDachshund.colour
                + "\n  Height of my dachshund = " + myDachshund.height
                + "\n  Weight of my dachshund = " + myDachshund.weight
                + "\n  Breed of my dachshund  - " + myDachshund.breed);

        Dog myHusky = new Dog();
        myHusky.colour = "Grey";
        myHusky.height = 50.5;
        myHusky.weight = 25.0;
        myHusky.breed = "Husky";
        System.out.println("\n \n  Colour of my husky - " + myHusky.colour
                + "\n  Height of my husky = " + myHusky.height
                + "\n  Weight of my husky = " + myHusky.weight
                + "\n  Breed of my husky  - " + myHusky.breed);
    }
}
