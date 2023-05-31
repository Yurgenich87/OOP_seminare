package SOLID.DIP;

/**
 * Класс Car представляет собой автомобиль, зависящий от типа двигателя.
 */
public class Car {
	private Engine engine;

	/**
	 * Конструктор класса Car инициализирует объект автомобиля с заданным типом
	 * двигателя.
	 *
	 * @param engine объект типа Engine, представляющий двигатель автомобиля
	 */
	public Car(Engine engine) {
		this.engine = engine;
	}

	/**
	 * Метод start() запускает автомобиль путем вызова метода start() у объекта
	 * двигателя.
	 */
	public void start() {
		this.engine.start();
	}
}
