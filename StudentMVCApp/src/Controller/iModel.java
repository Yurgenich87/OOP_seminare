package Controller;

import java.util.List;

import Model.Student;

/**
 * 
 * Интерфейс iModel определяет методы, которые должен реализовать класс-модель
 * приложения.
 */
public interface iModel {
	/**
	 * Метод добавляет студента в список студентов.
	 *
	 * @param student объект класса Student, который будет добавлен в список.
	 */
	public void addStudent(Student student);

	/**
	 * Метод удаляет студента из списка студентов.
	 *
	 * @param id идентификационный номер студента, который должен быть удален из
	 *           списка.
	 * @return true, если студент успешно удален из списка, иначе - false.
	 */
	public boolean deleteStudent(long id);

	/**
	 * Метод возвращает список всех студентов.
	 *
	 * @return список всех студентов.
	 */
	public List<Student> getAllStudent();
}