package Model;

/**
 * 
 * Класс, представляющий объект студента, наследующий от класса User и
 * реализующий интерфейс Comparable.
 * Содержит поля: имя, фамилия, возраст, номер студенческого билета и номер
 * группы.
 * Реализует метод compareTo для сравнения объектов класса по возрасту и номеру
 * студенческого билета.
 */
public class Student extends User implements Comparable<Student> {
	private long studentID;
	private int group;

	/**
	 * Конструктор класса.
	 * 
	 * @param firstName  имя студента
	 * @param secondName фамилия студента
	 * @param age        возраст студента
	 * @param studentID  номер студенческого билета
	 */
	public Student(String firstName, String secondName, int age, long studentID) {
		super(firstName, secondName, age);
		this.studentID = studentID;
	}

	/**
	 * Метод для получения номера студенческого билета.
	 * 
	 * @return номер студенческого билета
	 */
	public long getStudentID() {
		return studentID;
	}

	/**
	 * Метод для изменения номера студенческого билета.
	 * 
	 * @param studentID новый номер студенческого билета
	 */
	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	/**
	 * Переопределение метода toString для вывода информации о студенте.
	 * 
	 * @return строка, содержащая информацию об имени, фамилии, возрасте и номере
	 *         студенческого билета студента
	 */
	@Override
	public String toString() {
		return "Student{"
				+ "firstName=" + super.getFirstName()
				+ ", secondName=" + super.getSecondName()
				+ ", age=" + super.getAge()
				+ ", studentID=" + studentID
				+ '}';
	}

	/**
	 * Реализация метода compareTo для сравнения объектов класса по возрасту и
	 * номеру студенческого билета.
	 * 
	 * @param o объект класса Student, с которым производится сравнение
	 * @return значение 0, если объекты равны, отрицательное значение, если данный
	 *         объект меньше объекта-аргумента,
	 *         положительное значение, если данный объект больше объекта-аргумента
	 */
	@Override
	public int compareTo(Student o) {
		System.out.println(super.getFirstName() + " - " + o.getFirstName());
		if (super.getAge() == o.getAge()) {
			if (this.studentID == o.studentID) {
				return 0;
			}
			if (this.studentID < o.studentID) {
				return -1;
			}
			return 1;
		}
		if (super.getAge() < o.getAge()) {
			return -1;
		}
		return 1;
	}

	/**
	 * Метод для установки номера группы студента.
	 * 
	 * @param groupNumber номер группы
	 */
	public void setGroup(int groupNumber) {
		this.group = groupNumber;
	}
}
