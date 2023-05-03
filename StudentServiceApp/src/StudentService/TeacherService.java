package StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

/**
 * 
 * Класс TeacherService предоставляет функционал для работы с объектами класса
 * Teacher.
 * Реализует интерфейс iUserService, обобщающий методы для работы с
 * пользователями.
 */
public class TeacherService implements iUserService<Teacher> {
	private int count;
	private List<Teacher> teachers;

	/**
	 * Конструктор класса TeacherService, инициализирует поле teachers пустым
	 * списком.
	 */
	public TeacherService() {
		this.teachers = new ArrayList<>();
	}

	/**
	 * Сортирует и выводит список преподавателей по ученой степени.
	 */
	public void printSortedTeachers() {
		Collections.sort(teachers, Teacher.TEACHER_COMPARATOR);
		System.out.println(teachers);
	}

	/**
	 * Выводит список всех преподавателей, отсортированных по ФИО.
	 */
	public void printAll() {
		Collections.sort(teachers, new UserComparator());
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
	}

	/**
	 * Создает объект Teacher и добавляет его в список преподавателей.
	 * 
	 * @param firstName  Имя преподавателя
	 * @param secondName Фамилия преподавателя
	 * @param age        Возраст преподавателя
	 */

	public void create(String firstName, String secondName, int age) {
		Teacher teacher = new Teacher(firstName, secondName, age, count, "Нет ученой степени");
		count++;
		teachers.add(teacher);
	}

	/**
	 * Возвращает список всех преподавателей.
	 * 
	 * @return Список преподавателей
	 */

	public List<Teacher> getAll() {
		return teachers;
	}

	/**
	 * Возвращает ученую степень преподавателя.
	 * 
	 * @param object Преподаватель, у которого необходимо получить ученую степень
	 * @return Ученая степень преподавателя
	 */

	public String getAcademicDegree(Teacher object) {
		return object.getAcademicDegree();
	}

	/**
	 * Устанавливает ученую степень для преподавателя.
	 * 
	 * @param object         Преподаватель, у которого необходимо установить ученую
	 *                       степень
	 * @param academicDegree Ученая степень, которую необходимо установить
	 */

	public void setAcademicDegree(Teacher object, String academicDegree) {
		object.setAcademicDegree(academicDegree);
	}

}
