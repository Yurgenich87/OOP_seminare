package StudentDomen;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Класс, представляющий группу студентов.
 */

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
	private List<Student> students;
	private int id;
	private static int nextId = 1;
	public static Student previousGroup;

	/**
	 * Конструктор класса.
	 * 
	 * @param students список студентов, входящих в группу
	 */
	public StudentGroup(List<Student> students) {
		this.students = students;
		this.id = nextId++;
	}

	/**
	 * Получить список студентов, входящих в группу.
	 * 
	 * @return список студентов
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Получить идентификатор группы.
	 * 
	 * @return идентификатор группы
	 */
	public int getId() {
		return id;
	}

	/**
	 * Установить список студентов, входящих в группу.
	 * 
	 * @param students список студентов
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	/**
	 * Получить итератор для обхода списка студентов, входящих в группу.
	 * 
	 * @return итератор для обхода списка студентов
	 */
	@Override
	public Iterator<Student> iterator() {
		return new Iterator<Student>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < students.size();
			}

			@Override
			public Student next() {
				if (!hasNext()) {
					return null;
				}
				return students.get(index++);
			}

		};
	}

	/**
	 * Сравнение текущей группы студентов с переданной.
	 * 
	 * @param o группа студентов для сравнения
	 * @return результат сравнения
	 */
	@Override
	public int compareTo(StudentGroup o) {
		return Integer.compare(this.students.size(), o.students.size());
	}

	/**
	 * Получить строковое представление группы студентов.
	 * 
	 * @return строковое представление группы студентов
	 */
	@Override
	public String toString() {
		String studentsString = students.stream()
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
		return "Группа " + id + " (" + students.size() + " students)\n" + studentsString + "\n";
	}
}