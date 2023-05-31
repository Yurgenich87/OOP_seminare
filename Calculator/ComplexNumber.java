package Calculator;

/**
 * Класс, представляющий комплексное число.
 */
public class ComplexNumber {
	private double real; // действительная часть
	private double imaginary; // мнимая часть

	/**
	 * Конструктор для создания комплексного числа.
	 *
	 * @param real      действительная часть
	 * @param imaginary мнимая часть
	 */
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	/**
	 * Получить действительную часть комплексного числа.
	 *
	 * @return действительная часть
	 */
	public double getReal() {
		return real;
	}

	/**
	 * Получить мнимую часть комплексного числа.
	 *
	 * @return мнимая часть
	 */
	public double getImaginary() {
		return imaginary;
	}
}
