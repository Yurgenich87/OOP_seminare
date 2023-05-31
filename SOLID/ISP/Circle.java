package SOLID.ISP;

/**
 * Класс Circle представляет окружность и реализует интерфейс
 * TwoDimensionalShape.
 */
public class Circle implements TwoDimensionalShape {
	private double radius; // Радиус окружности

	/**
	 * Конструктор класса Circle.
	 *
	 * @param radius радиус окружности
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * Вычисляет площадь окружности.
	 *
	 * @return площадь окружности
	 */
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
