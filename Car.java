class Car {
    // State
    int noOfTypes = 4;
    int horns = 1;

    // Behaviors
    void drive() {
        System.out.println("Car is driving");
    }

    void honk() {
        System.out.println("Car horn is honking");
    }

    void startEngine() {
        System.out.println("Car engine started");
    }
}