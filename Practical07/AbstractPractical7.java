package Practical07;
// WAP to create abstract class shape and sub classes rectangle and triangle to implement the abstract methods draw() and area().

abstract class Shape {
	int l, b;

	public Shape(int val1, int val2) {
		l = val1;
		b = val2;
	}

	abstract void draw();

	abstract void area();
}

class Rectangle extends Shape {
	Rectangle(int a, int b) {
		super(a, b);
	}

	void draw() {
		System.out.println("Drawing Rectangle");
	}

	void area() {
		System.out.println("Area of Rectangle: " + l * b);
	}
}

class Triangle extends Shape {
	Triangle(int a, int b) {
		super(a, b);
	}

	void draw() {
		System.out.println("Drawing Triangle");
	}

	void area() {
		System.out.println("Area of Triangle: " + 0.5 * l * b);
	}
}

class AbstractPractical7 {
	public static void main(String args[]) {
		Shape s = new Triangle(10, 20);
		s.draw();
		s.area();

		Shape r = new Rectangle(12, 14);
		r.draw();
		r.area();
	}
}