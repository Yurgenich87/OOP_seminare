package StudentDomen;

/**
 * Класс, представляющий пользователя системы.
 * 
 * @param <T> параметризованный тип пользователя
 */
public class User<T> implements Comparable<User<T>> {

	private String firstName;
	private String secondName;
	private int age;

	/**
	 * Создает нового пользователя с заданными параметрами.
	 * 
	 * @param firstName  имя пользователя
	 * @param secondName фамилия пользователя
	 * @param age        возраст пользователя
	 */
	public User(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	/**
	 * Возвращает имя пользователя.
	 * 
	 * @return имя пользователя
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Устанавливает имя пользователя.
	 * 
	 * @param firstName имя пользователя
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Возвращает фамилию пользователя.
	 * 
	 * @return фамилия пользователя
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * Устанавливает фамилию пользователя.
	 * 
	 * @param secondName фамилия пользователя
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * Возвращает возраст пользователя.
	 * 
	 * @return возраст пользователя
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Устанавливает возраст пользователя.
	 * 
	 * @param age возраст пользователя
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Сравнивает текущего пользователя с переданным пользователем по возрасту.
	 * 
	 * @param o пользователь, с которым нужно сравнить текущего пользователя
	 * @return отрицательное число, если текущий пользователь младше переданного;
	 *         ноль, если пользователи имеют одинаковый возраст;
	 *         положительное число, если текущий пользователь старше переданного
	 */
	@Override
	public int compareTo(User<T> o) {
		if (this.age == o.age) {
			return 0;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return 1;
		}
	}

}
