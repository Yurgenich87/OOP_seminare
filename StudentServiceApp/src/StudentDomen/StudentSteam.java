package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
	private int streamNumber;
	private List<StudentGroup> studentGroups;

	public StudentSteam(int streamNumber) {
		this.streamNumber = streamNumber;
		studentGroups = new ArrayList<>();
	}

	public void addStudentGroup(StudentGroup studentGroup) {
		studentGroups.add(studentGroup);
	}

	public int getSteamNumber() {
		return streamNumber;
	}

	@Override
	public Iterator<StudentGroup> iterator() {
		return studentGroups.iterator();
	}

	public void sortGroupsByNumberOfStudents() {
		Collections.sort(studentGroups);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Поток: ").append(streamNumber).append("\n");
		for (StudentGroup group : studentGroups) {
			sb.append(group).append("\n");
		}
		return sb.toString();
	}
}
