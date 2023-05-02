package StudentDomen;

public class Teacher extends User {

	private int teacherId;
	private String academicDegree;

	public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
		super(firstName, secondName, age);
		this.teacherId = teacherId;
		this.academicDegree = academicDegree;
	}

	public int getTeacerId() {
		return teacherId;
	}

	public void setTeacerId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getLevel() {
		return academicDegree;
	}

	public void setLevel(String academicDegree) {
		this.academicDegree = academicDegree;
	}

}
