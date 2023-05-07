package Model;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class Model implements iGetModel {

	private Map<Integer, List<Student>> students;

	/**
	 * Конструктор класса Model. Создает две пустые группы для студентов.
	 */
	public Model() {
		students = new HashMap<>();
		students.put(1, new ArrayList<>());
		students.put(2, new ArrayList<>());
	}

	/**
	 * Добавляет студента в указанную группу.
	 * 
	 * @param student Добавляемый студент
	 * @param i       Номер группы, в которую добавляется студент
	 * @return true, если студент успешно добавлен в группу; false, если группа не
	 *         найдена
	 */
	public boolean addStudent(Student student, int i) {
		List<Student> groupStudents = students.get(i);
		if (groupStudents != null) {
			return groupStudents.add(student);
		}
		return false;
	}

	/**
	 * Удаляет студента по указанному ID.
	 * 
	 * @param id ID студента, который нужно удалить
	 * @return true, если студент успешно удален; false, если студент не найден
	 */
	public boolean deleteStudent(long id) {
		for (List<Student> groupStudents : students.values()) {
			for (Student student : groupStudents) {
				if (student.getAge() == id) {
					return groupStudents.remove(student);
				}
			}
		}
		return false;
	}

	/**
	 * Возвращает список всех студентов.
	 * 
	 * @return Список всех студентов
	 */
	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudents = new ArrayList<>();
		for (List<Student> groupStudents : students.values()) {
			allStudents.addAll(groupStudents);
		}
		return allStudents;
	}

	/**
	 * Ищет студента с указанным ID в списке моделей.
	 * 
	 * @param studentId ID искомого студента
	 * @param models    Список моделей, в которых нужно искать студента
	 * @return Найденный студент или null, если студент не найден
	 */
	public Student findStudent(long studentId, List<Model> models) {
		for (Model model : models) {
			Student student = model.getStudentById(studentId);
			if (student != null) {
				return student;
			}
		}
		return null;
	}

	/**
	 * Возвращает студента с указанным ID.
	 * 
	 * @param studentId ID искомого студента
	 * @return Найденный студент или null, если студент не найден
	 */
	private Student getStudentById(long studentId) {
		return null;
	}

	public void addStudentToGroup(Student s1, int i) {
		if (addStudent(s1, i)) {
			System.out.println("Студент " + s1.getFirstName() + " успешно добавлен в группу " + i);
		} else {
			System.out.println("Не удалось добавить студента " + s1.getFirstName() + " в группу " + i);
		}
	}
}
