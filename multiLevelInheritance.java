package JavaProgram;

class Shape {
	public void display() {
		System.out.println("Inside display");

	}
}

class Rectangle extends Shape {
	public void area() {
		System.out.println("Inside Area");
	}
}

class Cube extends Rectangle {
	public void volume() {
		System.out.println("Inside Volume");

	}
}

public class multiLevelInheritance {

	public static void main(String[] args) {

		Cube cube = new Cube();
		cube.display();
		cube.area();
		cube.volume();

	}

}
