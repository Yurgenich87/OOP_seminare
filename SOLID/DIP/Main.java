package SOLID.DIP;

/**
 * Класс Main является точкой входа в программу и демонстрирует использование
 * классов Car, PetrolEngine и DieselEngine.
 */
public class Main {
	public static void main(String[] args) {
		Engine petrolEngine = new PetrolEngine();
		Car car1 = new Car(petrolEngine);
		car1.start(); // Запуск бензинового двигателя

		Engine dieselEngine = new DieselEngine();
		Car car2 = new Car(dieselEngine);
		car2.start(); // Запуск дизельного двигателя
	}
}
