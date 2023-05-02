package StudentDomen;

/**
 * Класс, представляющий работника.
 */
public class Emploee extends User {

	/**
	 * Идентификатор работника.
	 */
	private int empId;

	/**
	 * Создает нового работника.
	 * 
	 * @param firstName  имя работника.
	 * @param secondName фамилия работника.
	 * @param age        возраст работника.
	 * @param empId      идентификатор работника.
	 */
	public Emploee(String firstName, String secondName, int age, int empId) {
		super(firstName, secondName, age);
		this.empId = empId;
	}

	/**
	 * Получает идентификатор работника.
	 * 
	 * @return идентификатор работника.
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * Устанавливает идентификатор работника.
	 * 
	 * @param empId идентификатор работника.
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
