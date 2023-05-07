package Controller;

import java.util.List;
import Model.Student;

/**
 * 
 * Интерфейс iGetModel определяет методы, которые должен реализовать
 * класс-контроллер приложения.
 */
public interface iGetModel {
	/**
	 * Метод возвращает список всех студентов.
	 *
	 * @return список всех студентов.
	 */
	public List<Student> getAllStudent();

	/**
	 * Метод удаляет студента из списка студентов.
	 *
	 * @param id идентификационный номер студента, который должен быть удален из
	 *           списка.
	 * @return true, если студент успешно удален из списка, иначе - false.
	 */
	public boolean deleteStudent(long id);

	/**
	 * Метод добавляет студента в группу.
	 *
	 * @param s1 объект класса Student, который будет добавлен в группу.
	 * @param i  номер группы, в которую будет добавлен студент.
	 */
	public void addStudentToGroup(Student s1, int i);
}