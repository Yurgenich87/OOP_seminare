package Controllers;

import StudentDomen.User;

/**
 * Интерфейс, определяющий контроллер для управления пользователями.
 * Параметризован типом T, который должен наследоваться от класса User.
 */
public interface iUserController<T extends User> {

	/**
	 * Создает нового пользователя с заданными параметрами.
	 *
	 * @param firstName  имя пользователя
	 * @param secondName фамилия пользователя
	 * @param age        возраст пользователя
	 */
	void create(String firstName, String secondName, int age);
}
