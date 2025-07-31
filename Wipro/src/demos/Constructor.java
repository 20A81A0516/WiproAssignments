package demos;

class Fruit {
	String name;
	String color;
	int price;

	Fruit() {
		name = "Unknown";
		color = "None";
		price = 0;
	}

	Fruit(String n, String c) {
		name = n;
		color = c;
		price = 0;
	}

	Fruit(String n, String c, int p) {
		name = n;
		color = c;
		price = p;
	}

	void show() {
		System.out.println("Name: " + name + ", Color: " + color + ", Price: ₹" + price);
	}
}

class Bottle {
	String type;
	int size;

	Bottle() {
		type = "Plastic";
		size = 0;
	}

	Bottle(String t, int s) {
		type = t;
		size = s;
	}

	void Bottle() {
		System.out.println("This is a method named Bottle, not a constructor");
	}

	void show() {
		System.out.println("Type: " + type + ", Size: " + size + "ml");
	}
}

public class Constructor {
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("Apple", "Red");
		Fruit f3 = new Fruit("Mango", "Yellow", 50);

		f1.show();
		f2.show();
		f3.show();

		Bottle b1 = new Bottle();
		Bottle b2 = new Bottle("Steel", 750);

		b1.show();
		b2.show();

		b2.Bottle();
	}
}


/*
Name: Unknown, Color: None, Price: ₹0
Name: Apple, Color: Red, Price: ₹0
Name: Mango, Color: Yellow, Price: ₹50
Type: Plastic, Size: 0ml
Type: Steel, Size: 750ml
This is a method named Bottle, not a constructor
 */

