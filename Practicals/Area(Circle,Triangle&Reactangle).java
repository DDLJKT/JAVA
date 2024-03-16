abstract class shape {
	int n1, n2;

	abstract void printArea();
}

class Rectangle extends shape {
	void printArea() {
		super.n1 = 10;
		super.n2 = 20;
		System.out.println("Area of a Rectangle: " + (super.n1 * super.n2));
	}
}

class Triangle extends shape {
	void printArea() {
		super.n1 = 10;
		super.n2 = 20;
		System.out.println("Area of a Triangle: " + (super.n1 * super.n2) / 2);
	}
}

class Circle extends shape {
	void printArea() {
		super.n1 = 10;
		System.out.println("Area of a Circle: " + (super.n1 * super.n1) * 3.14);
	}
}

class P17 {
	public static void main(String[] args) {

		Rectangle obj1 = new Rectangle();
		Triangle obj2 = new Triangle();
		Circle obj3 = new Circle();

		obj1.printArea();
		obj2.printArea();
		obj3.printArea();
	}
}