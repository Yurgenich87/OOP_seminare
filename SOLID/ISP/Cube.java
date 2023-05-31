package SOLID.ISP;

/**
 * Класс Cube представляет куб и реализует интерфейс ThreeDimensionalShape.
 */
public class Cube implements ThreeDimensionalShape {
	private int edge; // Длина ребра куба

	/**
	 * Конструктор класса Cube.
	 *
	 * @param edge длина ребра куба
	 */
	public Cube(int edge) {
		this.edge = edge;
	}

	/**
	 * Вычисляет объем куба.
	 *
	 * @return объем куба
	 */
	@Override
	public double volume() {
		return edge * edge * edge;
	}

	/**
	 * Вычисляет площадь поверхности куба.
	 *
	 * @return площадь поверхности куба
	 */
	public double surfaceArea() {
		return 6 * edge * edge;
	}
}
