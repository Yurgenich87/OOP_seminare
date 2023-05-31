package SOLID.LSP;

/**
 * Класс Shape представляет общую фигуру.
 */
public class Shape {
	protected int width; // Ширина фигуры
	protected int height; // Высота фигуры

	/**
	 * Установить ширину фигуры.
	 *
	 * @param width значение ширины для установки
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Установить высоту фигуры.
	 *
	 * @param height значение высоты для установки
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Вычислить площадь фигуры.
	 *
	 * @return площадь фигуры
	 */
	public int area() {
		return this.width * this.height;
	}
}
