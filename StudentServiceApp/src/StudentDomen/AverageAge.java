package StudentDomen;

import java.util.List;

/**
 * 
 * Обобщенный класс для вычисления среднего возраста списка пользователей.
 * 
 * @param <T> тип пользователя.
 */
public class AverageAge<T extends User> {

	/**
	 * 
	 * Метод для вычисления среднего возраста списка пользователей.
	 * 
	 * @param list список пользователей.
	 * 
	 * @return средний возраст пользователей из списка.
	 */
	public int calculateAverageAge(List<T> list) {
		int count = 0;
		int ageSum = 0;

		for (T item : list) {
			count++;
			ageSum += item.getAge();
		}

		return (int) ageSum / count;
	}
}