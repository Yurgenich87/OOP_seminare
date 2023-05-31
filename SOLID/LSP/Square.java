package SOLID.LSP;

/**
 * Класс Square представляет квадрат и является подклассом фигуры.
 */
public class Square extends Shape {
	/**
	 * Установить ширину и высоту квадрата.
	 *
	 * @param width значение ширины и высоты для установки
	 */
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	/**
	 * Установить ширину и высоту квадрата.
	 *
	 * @param height значение ширины и высоты для установки
	 */
	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
