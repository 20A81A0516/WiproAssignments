package demos;

abstract class MyVehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class MyCar extends MyVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key ignition.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped by turning off the key.");
    }
}

class MyMotorcycle extends MyVehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a self-start button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped by pressing the kill switch.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        MyVehicle car = new MyCar();
        MyVehicle bike = new MyMotorcycle();

        System.out.println("--- Car Operations ---");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n--- Motorcycle Operations ---");
        bike.startEngine();
        bike.stopEngine();
    }
}
