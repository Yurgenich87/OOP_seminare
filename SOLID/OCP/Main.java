package SOLID.OCP;

public class Main {
	public static void main(String[] args) {
		// Создание объектов
		Vehicle car = new Car(200, "Car");
		Vehicle bus = new Bus(120, "Bus");

		// Использование функциональности
		SpeedCalculation speedCalculation = new SpeedCalculation();
		double carAllowedSpeed = speedCalculation.calculateAllowedSpeed(car);
		double busAllowedSpeed = speedCalculation.calculateAllowedSpeed(bus);

		System.out.println("Car allowed speed: " + carAllowedSpeed);
		System.out.println("Bus allowed speed: " + busAllowedSpeed);
	}
}
