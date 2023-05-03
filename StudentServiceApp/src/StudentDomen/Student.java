package StudentDomen;

/**
 * Класс, представляющий студента.
 * Унаследован от класса User.
 */
public class Student extends User<Student> {

	private int studentId;
	private static int counter = 1;

	/**
	 * Конструктор класса Student.
	 * 
	 * @param firstName  имя студента
	 * @param secondName фамилия студента
	 * @param age        возраст студента
	 * @param studentId  номер студенческого билета студента
	 */
	public Student(String firstName, String secondName, int age, int studentId) {
		super(firstName, secondName, age);
		this.studentId = studentId;
	}

	/**
	 * Метод, возвращающий номер студенческого билета студента.
	 * 
	 * @return номер студенческого билета студента
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * Метод, устанавливающий номер студенческого билета студента.
	 * 
	 * @param studentId номер студенческого билета студента
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * Сброс счетчика.
	 */
	public static void resetCounter() {
		counter = 1;
	}

	/**
	 * Метод, возвращающий строковое представление объекта Student.
	 * 
	 * @return строковое представление объекта Student
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(counter++).append(". ");
		sb.append("Студент").append(": ");
		sb.append(getFirstName()).append(" ");
		sb.append(getSecondName()).append(", ");
		sb.append("возраст: ").append(getAge());
		return sb.toString();
	}
}
