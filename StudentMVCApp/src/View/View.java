package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * 
 * Класс View представляет пользовательский интерфейс программы и реализует
 * интерфейс iGetView.
 * Он содержит методы для отображения списка студентов, ввода сообщений от
 * пользователя и отображения списка доступных команд.
 */
public class View implements iGetView {

	/**
	 * Метод отображения списка всех студентов.
	 * Если список не пустой, то выводится каждый элемент списка.
	 * Иначе выводится соответствующее сообщение.
	 * 
	 * @param students список студентов
	 */
	public void printAllStudent(List<Student> students) {
		System.out.println("-----Вывод списка студентов-----");
		for (Student person : students) {
			System.out.println(person);
		}
		System.out.println("-----Конец списка-----");
	}

	/**
	 * Метод для получения сообщения от пользователя через консольный ввод.
	 * 
	 * @param message сообщение для пользователя
	 * @return введенная строка
	 */
	public String prompt(String message) {
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		return in.nextLine();
	}

	/**
	 * Метод для отображения сообщения на консоли.
	 * 
	 * @param string сообщение для отображения
	 */
	@Override
	public void println(String string) {
		System.out.println(string);
	}

	/**
	 * Метод для отображения списка доступных команд в программе.
	 */
	@Override
	public void printCommands() {
		System.out.println("Список команд:");
		System.out.println("list - отобразить список всех студентов");
		System.out.println("delete - удалить студента");
		System.out.println("language - выбрать язык");
		System.out.println("exit - выйти из программы");
	}
}