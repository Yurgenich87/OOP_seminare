package StudentDomen;

import java.util.Collections;
import java.util.Comparator;

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

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
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
		sb.append("Преподаватель").append(": ");
		sb.append(getFirstName()).append(" ");
		sb.append(getSecondName()).append(", ");
		sb.append("возраст: ").append(getAge()).append(", ");
		sb.append("teacherId: ").append(teacherId).append(", ");
		sb.append("ученая степень: ").append(academicDegree).append(". ");
		return sb.toString();
	}
}