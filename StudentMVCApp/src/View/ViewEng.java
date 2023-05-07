package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * 
 * Класс, представляющий текстовый интерфейс (консольный интерфейс) для
 * взаимодействия с пользователем.
 * Реализует интерфейс iGetView.
 */
public class ViewEng implements iGetView {

	/**
	 * Выводит сообщение на экран с переводом строки.
	 * 
	 * @param message сообщение для вывода на экран.
	 */
	public void println(String message) {
		System.out.println(message);
	}

	/**
	 * Выводит список всех студентов на экран.
	 * Если список пуст, выводит соответствующее сообщение.
	 * 
	 * @param students список студентов для вывода на экран.
	 */
	@Override
	public void printAllStudent(List<Student> students) {
		if (students.size() > 0) {
			System.out.println("-----List of students:-----");
			for (Student student : students) {
				System.out.println(student.toString());
			}
			System.out.println("-----End of list-----");
		} else {
			System.out.println("-----Список студентов пуст!-----");
		}
	}

	/**
	 * Предлагает ввести данные с консоли.
	 * 
	 * @param message сообщение, которое будет выведено перед вводом данных.
	 * @return введенные данные в виде строки.
	 */
	@Override
	public String prompt(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();

	}

	/**
	 * Выводит на экран список доступных команд.
	 */
	@Override
	public void printCommands() {
		System.out.println("Список команд:");
		System.out.println("list - вывести список всех студентов");
		System.out.println("delete - удалить студента");
		System.out.println("language - выбрать язык");
		System.out.println("exit - выход из программы");
	}
}