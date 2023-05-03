package StudentDomen;

public class Student extends User<Student> {

	private int studentId;
	private static int counter = 1;

	public Student(String firstName, String secondName, int age, int studentId) {
		super(firstName, secondName, age);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public static void resetCounter() {
		counter = 1;
	}

	// @Override
	// public String toString() {
	// StringBuilder sb = new StringBuilder();
	// sb.append(counter++).append(". ");
	// sb.append("Студент").append(": ");
	// sb.append(getFirstName()).append(" ");
	// sb.append(getSecondName()).append(", ");
	// sb.append("возраст: ").append(getAge());
	// return sb.toString();
	// }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(counter++).append(". ");
		sb.append("Студент").append(": ");
		sb.append(getFirstName()).append(" ");
		sb.append(getSecondName()).append(", ");
		sb.append("возраст: ").append(getAge());
		return sb.toString();
	}
}