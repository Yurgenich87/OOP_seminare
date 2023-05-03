package StudentDomen;

import java.util.Comparator;

/**
 * Компаратор для сравнения пользователей по возрасту.
 * 
 * @param <T> тип пользователя, должен быть наследником класса User
 */

public class AgeComparator<T extends User> implements Comparator<T> {

	/**
	 * Сравнивает двух пользователей по возрасту.
	 * 
	 * @param o1 первый пользователь для сравнения
	 * @param o2 второй пользователь для сравнения
	 * @return 0, если возрасты пользователей равны; отрицательное число, если
	 *         возраст первого пользователя меньше возраста второго пользователя;
	 *         положительное число, если возраст первого пользователя больше
	 *         возраста
	 *         второго пользователя.
	 */
	@Override
	public int compare(T o1, T o2) {
		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		} else {
			return 1;
		}
	}
}