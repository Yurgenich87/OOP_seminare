package StudentDomen;

public class Emploee extends User<Emploee> {

	private int emploeeId;
	private double salary;
	private static int counter = 1;

	public Emploee(String firstName, String secondName, int age, int emploeeId, double salary) {
		super(firstName, secondName, age);
		this.emploeeId = emploeeId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return emploeeId;
	}

	public void setEmployeeId(int emploeeId) {
		this.emploeeId = emploeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * Переопределение метода toString() для вывода информации о преподавателе.
	 * 
	 * @return строка с информацией о преподавателе
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