package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/**
 * 
 * Класс, представляющий сервис для работы с группами студентов.
 */
public class StudentGroupService {

	/**
	 * 
	 * Список групп студентов.
	 */
	private List<StudentGroup> groups;

	/**
	 * 
	 * Конструктор класса StudentGroupService.
	 * Инициализирует пустой список групп студентов.
	 */
	public StudentGroupService() {
		this.groups = new ArrayList<>();
	}

	/**
	 * 
	 * Возвращает список всех групп студентов.
	 * 
	 * @return Список групп студентов.
	 */
	public List<StudentGroup> getAll() {
		return this.groups;
	}

	/**
	 * 
	 * Возвращает отсортированный по ФИО список студентов указанной группы.
	 * 
	 * @param numberGroup Номер группы.
	 * @return Отсортированный список студентов.
	 */
	public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
		List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
		students.sort(new UserComparator<Student>());
		return students;
	}
}