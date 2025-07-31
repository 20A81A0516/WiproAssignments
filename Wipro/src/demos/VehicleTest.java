package demos;
abstract class Vehicle {
 abstract void startEngine();

 abstract void stopEngine();
}
class Car extends Vehicle {
 void startEngine() {
     System.out.println("Car engine started with a key ignition.");
 }

 void stopEngine() {
     System.out.println("Car engine stopped by turning off the key.");
 }
}

class Motorcycle extends Vehicle {
 void startEngine() {
     System.out.println("Motorcycle engine started with a self-start button.");
 }

 void stopEngine() {
     System.out.println("Motorcycle engine stopped by pressing the kill switch.");
 }
}

public class VehicleTest {
 public static void main(String[] args) {
     Vehicle car = new Car(); 
     Vehicle bike = new Motorcycle(); 

     System.out.println("--- Car Operations ---");
     car.startEngine();
     car.stopEngine();

     System.out.println("\n--- Motorcycle Operations ---");
     bike.startEngine();
     bike.stopEngine();
 }
}

