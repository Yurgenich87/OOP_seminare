package SOLID.LSP;

/**
 * Класс Main является точкой входа в программу и демонстрирует использование
 * методов классов Shape, Rectangle и Square.
 */
public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setHeight(3);
		System.out.println("Площадь прямоугольника: " + rectangle.area());

		Square square = new Square();
		square.setWidth(4);
		System.out.println("Площадь квадрата: " + square.area());
	}
}
