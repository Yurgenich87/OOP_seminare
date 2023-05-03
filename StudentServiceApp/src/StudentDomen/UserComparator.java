package StudentDomen;

import java.util.Comparator;

/**
 * Класс для сравнения пользователей (студентов и преподавателей) по имени и
 * фамилии.
 *
 * @param <T> класс пользователя (студент или преподаватель)
 */
public class UserComparator<T extends User> implements Comparator<T> {

	/**
	 * Сравнивает двух пользователей по имени и фамилии в алфавитном порядке.
	 *
	 * @param o1 первый пользователь для сравнения
	 * @param o2 второй пользователь для сравнения
	 * @return отрицательное число, если первый пользователь предшествует второму по
	 *         алфавиту, положительное число, если второй пользователь предшествует
	 *         первому по
	 *         алфавиту, иначе 0, если имена и фамилии пользователей одинаковы
	 */
	@Override
	public int compare(T o1, T o2) {
		int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
		if (resultOfComparing == 0) {
			resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
			return resultOfComparing;
		} else {
			return resultOfComparing;
		}
	}

}
