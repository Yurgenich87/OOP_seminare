package SOLID.DIP;

/**
 * Класс PetrolEngine представляет собой бензиновый двигатель.
 */
public class PetrolEngine implements Engine {
	/**
	 * Метод start() запускает бензиновый двигатель.
	 */
	public void start() {
		System.out.println("Запустили бензиновый двигатель");
	}
}
