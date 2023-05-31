package SOLID.ISP;

/**
 * Класс Main является точкой входа в программу и демонстрирует использование
 * методов классов Circle и Cube.
 */
public class Main {
	public static void main(String[] args) {
		TwoDimensionalShape circle = new Circle(5);
		System.out.println("Площадь круга: " + circle.area());

		ThreeDimensionalShape cube = new Cube(3);
		System.out.println("Объем куба: " + cube.volume());
	}
}
