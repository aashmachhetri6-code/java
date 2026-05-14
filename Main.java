public class Main {
    public static void main(String[] args) {

        Bike b = new Bike();
        Car c = new Car();
        Truck t = new Truck();

        // Bike
        System.out.println("Bike:");
        System.out.println("Types: " + b.noOfTypes);
        System.out.println("Horns: " + b.horns);
        b.drive();
        b.honk();
        b.startEngine();

        System.out.println();

        // Car
        System.out.println("Car:");
        System.out.println("Types: " + c.noOfTypes);
        System.out.println("Horns: " + c.horns);
        c.drive();
        c.honk();
        c.startEngine();

        System.out.println();

        // Truck
        System.out.println("Truck:");
        System.out.println("Types: " + t.noOfTypes);
        System.out.println("Horns: " + t.horns);
        t.drive();
        t.honk();
        t.startEngine();
    }
}