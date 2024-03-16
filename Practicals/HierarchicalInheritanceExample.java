class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

class Bike extends Vehicle {
    public void brake() {
        System.out.println("Bike is braking.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.move(); // Inherited from Vehicle
        car.accelerate(); // Specific to Car

        Bike bike = new Bike();
        bike.move(); // Inherited from Vehicle
        bike.brake(); // Specific to Bike
    }
}
