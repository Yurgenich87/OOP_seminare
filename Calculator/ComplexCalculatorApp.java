package Calculator;

import java.util.logging.Logger;

/**
 * Пример использования калькулятора комплексных чисел.
 */
import java.util.logging.Logger;

/**
 * Пример использования калькулятора комплексных чисел.
 */
public class ComplexCalculatorApp {
	public static void main(String[] args) {
		// Создаем логгер для записи логов
		Logger logger = Logger.getLogger(ComplexCalculatorApp.class.getName());

		// Создаем экземпляр калькулятора комплексных чисел
		ComplexCalculator calculator = new SimpleComplexCalculator(logger);

		// Создаем два комплексных числа
		ComplexNumber a = new ComplexNumber(1, 2);
		ComplexNumber b = new ComplexNumber(3, 4);

		// Выполняем операцию сложения
		ComplexNumber sum = calculator.add(a, b);
		System.out.println("Сумма: " + sum.getReal() + " + " + sum.getImaginary() + "i");

		// Выполняем операцию умножения
		ComplexNumber product = calculator.multiply(a, b);
		System.out.println("Произведение: " + product.getReal() + " + " + product.getImaginary() + "i");

		// Выполняем операцию деления
		ComplexNumber division = calculator.divide(a, b);
		System.out.println("Деление: " + division.getReal() + " + " + division.getImaginary() + "i");
	}
}
