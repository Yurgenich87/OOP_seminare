package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий поток студентов.
 */
public class StudentSteam implements Iterable<StudentGroup> {

	private int streamNumber;
	private List<StudentGroup> studentGroups;

	/**
	 * Конструктор класса.
	 * 
	 * @param streamNumber номер потока студентов
	 */
	public StudentSteam(int streamNumber) {
		this.streamNumber = streamNumber;
		studentGroups = new ArrayList<>();
	}

	/**
	 * Метод для добавления группы студентов в поток.
	 * 
	 * @param studentGroup группа студентов, которую нужно добавить в поток
	 */
	public void addStudentGroup(StudentGroup studentGroup) {
		studentGroups.add(studentGroup);
	}

	/**
	 * Метод для получения номера потока студентов.
	 * 
	 * @return номер потока студентов
	 */
	public int getSteamNumber() {
		return streamNumber;
	}

	@Override
	public Iterator<StudentGroup> iterator() {
		return studentGroups.iterator();
	}

	/**
	 * Метод для сортировки групп студентов по количеству студентов.
	 */
	public void sortGroupsByNumberOfStudents() {
		Collections.sort(studentGroups);
	}

	@Override
	/**
	 * Метод для получения текстового представления объекта.
	 * 
	 * @return текстовое представление объекта
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Поток: ").append(streamNumber).append("\n");
		for (StudentGroup group : studentGroups) {
			sb.append(group).append("\n");
		}
		return sb.toString();
	}
}
