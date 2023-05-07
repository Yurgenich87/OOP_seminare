package Controller;

import java.util.List;
import Model.Student;

/**
 * 
 * Интерфейс iGetView определяет методы, которые должен реализовать
 * класс-представление приложения.
 */
public interface iGetView {
	/**
	 * Метод выводит список всех студентов на экран.
	 *
	 * @param students список студентов, которые должны быть выведены на экран.
	 */
	void printAllStudent(List<Student> students);

	/**
	 * Метод выводит на экран сообщение и ожидает ввода пользователем.
	 *
	 * @param message сообщение, которое будет выведено на экран.
	 * @return введенная пользователем строка.
	 */
	String prompt(String message);

	/**
	 * Метод выводит на экран строку.
	 *
	 * @param string строка, которая должна быть выведена на экран.
	 */
	void println(String string);

	/**
	 * Метод выводит на экран список доступных команд.
	 */
	void printCommands();
}