package demos;

class Book {
	private int id;
	private String title;
	private double price;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
}

class Pen {
	private String brand;
	private String color;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}

public class DataAbstraction_Encapsulation {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setId(101);
		b1.setTitle("Java Basics");
		b1.setPrice(299.50);

		System.out.println("Book: " + b1.getId() + " " + b1.getTitle() + " ₹" + b1.getPrice());

		Pen p1 = new Pen();
		p1.setBrand("Reynolds");
		p1.setColor("Blue");

		System.out.println("Pen: " + p1.getBrand() + " " + p1.getColor());
	}
}



/*
Book: 101 Java Basics ₹299.5
Pen: Reynolds Blue
*/