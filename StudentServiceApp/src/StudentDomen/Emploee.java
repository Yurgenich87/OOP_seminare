package StudentDomen;

public class Emploee extends User<Emploee> {

	private int emploeeId;
	private double salary;
	private static int counter = 1;

	/**
	 * Конструктор класса Employee.
	 * 
	 * @param firstName  имя сотрудника
	 * @param secondName фамилия сотрудника
	 * @param age        возраст сотрудника
	 * @param emploeeId  идентификационный номер сотрудника
	 * @param salary     зарплата сотрудника
	 */
	public Emploee(String firstName, String secondName, int age, int emploeeId, double salary) {
		super(firstName, secondName, age);
		this.emploeeId = emploeeId;
		this.salary = salary;
	}

	/**
	 * Получение идентификационного номера сотрудника.
	 * 
	 * @return идентификационный номер сотрудника
	 */
	public int getEmployeeId() {
		return emploeeId;
	}

	/**
	 * Установка идентификационного номера сотрудника.
	 * 
	 * @param emploeeId идентификационный номер сотрудника
	 */
	public void setEmployeeId(int emploeeId) {
		this.emploeeId = emploeeId;
	}

	/**
	 * Получение зарплаты сотрудника.
	 * 
	 * @return зарплата сотрудника
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Установка зарплаты сотрудника.
	 * 
	 * @param salary зарплата сотрудника
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Переопределение метода toString() для вывода информации о сотруднике.
	 * 
	 * @return строка с информацией о сотруднике
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(counter++).append(". ");
		sb.append("Работник").append(": ");
		sb.append(getFirstName()).append(" ");
		sb.append(getSecondName()).append(", ");
		sb.append("возраст: ").append(getAge());
		return sb.toString();
	}
}
