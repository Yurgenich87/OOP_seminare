package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для перебора студентов в группе.
 */
public class StudentGroupIterator implements Iterator<Student> {
	private int counter;
	private final List<Student> students;

	/**
	 * Создает новый экземпляр итератора для указанного списка студентов.
	 *
	 * @param students список студентов
	 */
	public StudentGroupIterator(List<Student> students) {
		this.students = students;
		this.counter = 0;
	}

	/**
	 * Проверяет, есть ли следующий элемент в списке.
	 *
	 * @return true, если следующий элемент есть, false в противном случае
	 */
	@Override
	public boolean hasNext() {
		return counter < students.size();
	}

	/**
	 * Возвращает следующий элемент в списке.
	 *
	 * @return следующий элемент в списке, или null, если элементов больше нет
	 */
	@Override
	public Student next() {
		if (!hasNext()) {
			return null;
		}
		return students.get(counter++);
	}
}
