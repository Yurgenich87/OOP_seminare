package Calculator;

/**
 * Интерфейс для операций над комплексными числами.
 */
public interface ComplexCalculator {
	/**
	 * Сложение двух комплексных чисел.
	 *
	 * @param a первое комплексное число
	 * @param b второе комплексное число
	 * @return результат сложения
	 */
	ComplexNumber add(ComplexNumber a, ComplexNumber b);

	/**
	 * Умножение двух комплексных чисел.
	 *
	 * @param a первое комплексное число
	 * @param b второе комплексное число
	 * @return результат умножения
	 */
	ComplexNumber multiply(ComplexNumber a, ComplexNumber b);

	/**
	 * Деление двух комплексных чисел.
	 *
	 * @param a делимое комплексное число
	 * @param b делитель комплексное число
	 * @return результат деления
	 */
	ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}
