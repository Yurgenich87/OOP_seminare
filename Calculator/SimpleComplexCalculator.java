package Calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Реализация калькулятора комплексных чисел.
 */
public class SimpleComplexCalculator implements ComplexCalculator {
	private Logger logger; // логгер для записи логов

	/**
	 * Конструктор для создания калькулятора комплексных чисел.
	 *
	 * @param logger логгер для записи логов
	 */
	public SimpleComplexCalculator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		double realPart = a.getReal() + b.getReal();
		double imaginaryPart = a.getImaginary() + b.getImaginary();
		ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

		logger.log(Level.INFO, "Сложение: {0} + {1} = {2}", new Object[] { a, b, result });
		return result;
	}

	@Override
	public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
		double realPart = (a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary());
		double imaginaryPart = (a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal());
		ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

		logger.log(Level.INFO, "Умножение: {0} * {1} = {2}", new Object[] { a, b, result });
		return result;
	}

	@Override
	public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
		double denominator = (b.getReal() * b.getReal()) + (b.getImaginary() * b.getImaginary());
		double realPart = ((a.getReal() * b.getReal()) + (a.getImaginary() * b.getImaginary())) / denominator;
		double imaginaryPart = ((a.getImaginary() * b.getReal()) - (a.getReal() * b.getImaginary())) / denominator;
		ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);

		logger.log(Level.INFO, "Деление: {0} / {1} = {2}", new Object[] { a, b, result });
		return result;
	}
}
