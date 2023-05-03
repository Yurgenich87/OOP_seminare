package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

/**
 * 
 * Класс-контроллер для управления объектами типа Teacher.
 */

public class TeacherController implements iUserController<Teacher> {

	private final TeacherService dataService = new TeacherService();

	/**
	 * Создает новый объект типа Teacher.
	 * 
	 * @param firstName  имя преподавателя.
	 * @param secondName фамилия преподавателя.
	 * @param age        возраст преподавателя.
	 */
	@Override
	public void create(String firstName, String secondName, int age) {
		dataService.create(firstName, secondName, age);
	}
}