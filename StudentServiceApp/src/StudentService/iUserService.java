package StudentService;

import java.util.List;

/**
 * 
 * Интерфейс для работы с пользователем. Определяет основные методы для
 * 
 * создания и получения списка пользователей.
 * 
 * @param <T> - тип объекта, представляющего пользователя
 */
public interface iUserService<T> {

	/**
	 * 
	 * Возвращает список всех пользователей.
	 * 
	 * @return список пользователей
	 */
	List<T> getAll();

	/**
	 * 
	 * Создает нового пользователя.
	 * 
	 * @param firstName  - имя пользователя
	 * @param secondName - фамилия пользователя
	 * @param age        - возраст пользователя
	 */
	void create(String firstName, String secondName, int age);
}