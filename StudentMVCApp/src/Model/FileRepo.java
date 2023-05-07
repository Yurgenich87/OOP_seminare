package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Controller.iGetModel;

/**
 * 
 * Класс FileRepo представляет собой реализацию интерфейса iGetModel для работы
 * с данными о студентах в файле.
 * Класс обеспечивает чтение и запись данных из/в файл, а также добавление,
 * удаление и поиск студентов.
 * 
 * @author [автор]
 * @version [версия]
 */
public class FileRepo implements iGetModel {
	private String fileName;
	private List<Student> students;

	/**
	 * Конструктор класса FileRepo, инициализирующий имя файла и список студентов.
	 * Также создаёт пустой файл, если он не существует.
	 * 
	 * @param fileName имя файла
	 */
	public FileRepo(String fileName) {
		this.fileName = fileName;
		this.students = new ArrayList<>();
		try (FileWriter fw = new FileWriter(fileName, true)) {
			fw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Метод добавляет студента в список студентов.
	 * 
	 * @param student студент, который будет добавлен
	 */
	public void addStudent(Student student) {
		this.students.add(student);
	}

	/**
	 * Метод для чтения данных о всех студентах из файла.
	 */
	public void readAllStudentsFromFile() {
		try {
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			while (line != null) {
				String[] param = line.split(" ");
				Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
				students.add(pers);
				line = reader.readLine();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Метод для записи всех студентов в файл.
	 */
	public void saveAllStudentToFile() {
		try (FileWriter fw = new FileWriter(fileName, false)) {
			fw.write("");
			for (Student pers : students) {
				fw.write(
						pers.getFirstName() + " " + pers.getSecondName() + " " + pers.getAge() + " " + pers.getStudentID());
				fw.append('\n');
			}
			fw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Метод для получения списка всех студентов.
	 * 
	 * @return список всех студентов
	 */
	@Override
	public List<Student> getAllStudent() {
		readAllStudentsFromFile();
		return students;
	}

	/**
	 * Метод для удаления студента из списка студентов.
	 * 
	 * @param studentID идентификатор студента, который будет удалён
	 * @return true, если студент успешно удалён, false в противном случае
	 */

	@Override
	public boolean deleteStudent(long studentID) {
		boolean removed = false;
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			if (student.getStudentID() == studentID) {
				iterator.remove();
				removed = true;
			}
		}
		if (removed) {
			saveAllStudentToFile();
		}
		return removed;
	}

	/**
	 * 
	 * Метод добавляет студента в группу и выводит сообщение об успешном добавлении.
	 * 
	 * @param s1 объект класса Student, который будет добавлен в группу.
	 * @param i  номер группы, в которую будет добавлен студент.
	 */
	@Override
	public void addStudentToGroup(Student s1, int i) {
		s1.setGroup(i);
		addStudent(s1);
		System.out.println("Студент " + s1.getFirstName() + " успешно добавлен в группу " + i);
	}

	/**
	 * 
	 * Метод осуществляет поиск студента по его идентификационному номеру.
	 * 
	 * @param studentId идентификационный номер студента, которого необходимо найти.
	 * @return объект класса Student, если студент найден, иначе возвращает null.
	 */
	public Student findStudent(long studentId) {
		for (Student student : students) {
			System.out.println("Student: " + student.getStudentID());
			if (student.getStudentID() == studentId) {
				return student;
			}
			break;
		}
		return null;
	}
}