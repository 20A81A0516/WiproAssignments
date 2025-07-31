package demos;

class Vehicle extends Object {

	int wheels = 4;

	public void start() {
		System.out.println("Vehicle starts with key"); 
	}

	public void showType() {
		System.out.println("Vehicle class showType()"); 
	}
}

class Bike extends Vehicle {
	int wheels = 2;

	public void speed() {
		System.out.println("Bike speed is 80 km/h");
	}

	public void showType() {
		System.out.println("Bike class showType()");
		super.showType(); 
		System.out.println("Wheels using this: " + this.wheels);
		System.out.println("Wheels using super: " + super.wheels); 
	}
}

class Car extends Vehicle {
	public void comfort() {
		System.out.println("Car has AC and music system");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Bike b = new Bike();

		b.start(); 
		b.speed();
		b.showType(); 

		Car c = new Car();
		c.start();
		c.comfort(); 
	}
}


/*
Vehicle starts with key
Bike speed is 80 km/h
Bike class showType()
Vehicle class showType()
Wheels using this: 2
Wheels using super: 4
Vehicle starts with key
Car has AC and music system
*/