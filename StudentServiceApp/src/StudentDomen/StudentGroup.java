package StudentDomen;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
	private List<Student> students;
	private int id;
	private static int nextId = 1;
	public static Student previousGroup;

	public StudentGroup(List<Student> students) {
		this.students = students;
		this.id = nextId++;
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getId() {
		return id;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	// @Override
	// public Iterator<Student> iterator() {
	// return new StudentGroupIterator(students);
	// }

	@Override
	public Iterator<Student> iterator() {
		return new Iterator<Student>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < students.size();
			}

			@Override
			public Student next() {
				if (!hasNext()) {
					return null;
				}
				// counter++;
				return students.get(index++);
			}

		};
	}

	@Override
	public int compareTo(StudentGroup o) {
		return Integer.compare(this.students.size(), o.students.size());
	}

	@Override
	public String toString() {
		String studentsString = students.stream()
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
		return "Группа " + id + " (" + students.size() + " students)\n" + studentsString + "\n";
	}
}
