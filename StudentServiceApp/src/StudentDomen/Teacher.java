package StudentDomen;

import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * Класс, представляющий преподавателя.
 */

public class Teacher extends User<Teacher> {

	public static final Comparator TEACHER_COMPARATOR = null;
	private int teacherId;
	private String academicDegree;
	private static int counter = 1;

	public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
		super(firstName, secondName, age);
		this.teacherId = teacherId;
		this.academicDegree = academicDegree;
	}

	/**
	 * Возвращает идентификатор преподавателя.
	 * 
	 * @return идентификатор преподавателя
	 */
	public int getTeacherId() {
		return teacherId;
	}

	/**
	 * Устанавливает идентификатор преподавателя.
	 * 
	 * @param teacherId идентификатор преподавателя
	 */
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	/**
	 * Возвращает ученую степень преподавателя.
	 * 
	 * @return ученая степень преподавателя
	 */
	public String getAcademicDegree() {
		return academicDegree;
	}

	/**
	 * Устанавливает ученую степень преподавателя.
	 * 
	 * @param academicDegree ученая степень преподавателя
	 */
	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}

	/**
	 * Сбрасывает переменную нумерации при смене метода.
	 */

	public static void resetCounter() {
		counter = 1;
	}

	/**
	 * Переопределение метода toString() для вывода информации о преподавателе.
	 * 
	 * @return строка с информацией о преподавателе
	 */

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(counter++).append(". ");
		sb.append("Преподаватель").append(": ");
		sb.append(getFirstName()).append(" ");
		sb.append(getSecondName()).append(", ");
		sb.append("возраст: ").append(getAge()).append(", ");
		sb.append("teacherId: ").append(teacherId).append(", ");
		sb.append("ученая степень: ").append(academicDegree).append(". ");
		return sb.toString();
	}
}
