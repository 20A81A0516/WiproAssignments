package practice;
class Vehicle {
    String color;
    int wheels;
    String model;

    Vehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    Car(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void drive() {
        System.out.println("Car is driving smoothly.");
    }
}

class Truck extends Vehicle {
    Truck(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void haul() {
        System.out.println("Truck is hauling heavy goods.");
    }
}

class Bus extends Vehicle {
    Bus(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void transport() {
        System.out.println("Bus is transporting passengers.");
    }
}

class Road {
    public static void main(String[] args) {
        Car car = new Car("Red", 4, "Suzuki Swift");
        Truck truck = new Truck("Blue", 6, "Tata Heavy");
        Bus bus = new Bus("Yellow", 6, "Volvo AC");

        System.out.println("Car Details:");
        car.showDetails();
        car.drive();

        System.out.println("\nTruck Details:");
        truck.showDetails();
        truck.haul();

        System.out.println("\nBus Details:");
        bus.showDetails();
        bus.transport();
    }
}


/*
Car Details:
Color: Red
Wheels: 4
Model: Suzuki Swift
Car is driving smoothly.

Truck Details:
Color: Blue
Wheels: 6
Model: Tata Heavy
Truck is hauling heavy goods.

Bus Details:
Color: Yellow
Wheels: 6
Model: Volvo AC
Bus is transporting passengers.
*/
