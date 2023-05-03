package StudentDomen;

import java.util.Comparator;

public class AgeComparator<T extends User> implements Comparator<T> {

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
