package StudentDomen;

public class User<T> implements Comparable<User<T>> {

	private String firstName;
	private String secondName;
	private int age;

	public User(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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