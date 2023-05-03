package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

/**
 * 
 * Класс EmploeeService представляет сервис для работы с объектами класса
 * Emploee.
 * Реализует интерфейс iUserService<Emploee>.
 */

public class EmploeeService {
	private int count;
	private List<Emploee> emploees;

	/**
	 * Конструктор класса EmploeeService.
	 * Создает новый пустой список emploees.
	 */
	public EmploeeService() {
		this.emploees = new ArrayList<Emploee>();
	}

	/**
	 * Возвращает список всех работников.
	 *
	 * @return список всех работников.
	 */
	public List<Emploee> getAll() {
		return emploees;
	}

	public List<Emploee> getSortedByFIOStudentGroup(int numberGroup) {
		List<Emploee> emps = new ArrayList<>(emploees);
		emps.sort(new UserComparator<Emploee>());
		return emps;
	}

	public void create(String firstName, String secondName, int age) {
	}

}