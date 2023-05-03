package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

/**
 * Класс, представляющий сервис для работы с объектами типа Student.
 * Реализует интерфейс iUserService.
 */
public class StudentService implements iUserService<Student> {
	private int count;
	private List<Student> students;

	/**
	 * Конструктор класса StudentService.
	 * Создает новый экземпляр списка студентов.
	 */
	public StudentService() {
		this.students = new ArrayList<Student>();
	}

	/**
	 * Создает нового студента и добавляет его в список.
	 * Увеличивает счетчик количества студентов на 1.
	 *
	 * @param firstName  имя студента.
	 * @param secondName фамилия студента.
	 * @param age        возраст студента.
	 */

	public void create(String firstName, String secondName, int age) {
		Student per = new Student(firstName, secondName, age, count);
		count++;
		students.add(per);
	}

	/**
	 * Возвращает список всех студентов.
	 *
	 * @return список всех студентов.
	 */

	public List<Student> getAll() {
		return students;
	}

}
