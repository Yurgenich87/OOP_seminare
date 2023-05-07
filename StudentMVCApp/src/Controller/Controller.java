package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

/**
 * 
 * Класс-контроллер, который связывает модель и представление,
 * обеспечивает обновление и отображение списка студентов,
 * а также обработку команд пользователя.
 */

public class Controller {

	private List<Student> students;
	private View viewRus;
	private iGetModel model;
	private iGetView currentView;
	private ViewEng viewEng;

	/**
	 * Конструктор класса Controller.
	 * 
	 * @param view  Представление.
	 * @param model Модель.
	 */
	public Controller(iGetView view, iGetModel model) {
		this.model = model;
		this.students = new ArrayList<Student>();
		this.viewRus = new View();
		this.viewEng = new ViewEng();
		this.currentView = view;
	}

	/**
	 * Получает список всех студентов из модели.
	 */
	public void getAllStudent() {
		students.clear();
		students = model.getAllStudent();
	}

	/**
	 * Проверяет, есть ли данные о студентах.
	 * 
	 * @return true, если данные есть; false, если данных нет.
	 */
	public boolean testData() {
		if (students.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Обновляет и отображает список всех студентов.
	 */
	public void updateView() {
		getAllStudent();
		if (testData()) {
			currentView.printAllStudent(students);
			currentView.printCommands();
		} else {
			System.out.println("----Список студентов пуст!----");
		}
	}

	/**
	 * Переключает язык интерфейса.
	 * 
	 * @param language Язык, на который нужно переключиться.
	 */
	public void switchLanguage(String language) {
		if (language.equals("rus")) {
			currentView = viewRus;
		} else if (language.equals("eng")) {
			currentView = viewEng;
		} else {
			System.out.println("----Выбран неверный язык, выберите снова.----");
			switchLanguage(currentView.prompt("Выберите язык/Select language (rus/eng): "));
		}
	}

	/**
	 * Отображает список команд, доступных для пользователя.
	 */
	public void printCommands() {
		System.out.println("----Список команд:----");
		System.out.println("list - отобразить список всех студентов");
		System.out.println("delete - удалить студента");
		System.out.println("language - выбрать язык");
		System.out.println("exit - выйти из программы");
	}

	/**
	 * Запускает программу, обрабатывает команды пользователя и отображает
	 * результаты.
	 */
	public void run() {
		switchLanguage(currentView.prompt("Выберите язык/Select language (rus/eng): "));
		currentView.printCommands();
		boolean getNewIteration = true;
		while (getNewIteration) {
			String command = currentView.prompt("Введите команду:");
			Commands com = Commands.valueOf(command.toUpperCase());
			switch (com) {
				case EXIT:
					getNewIteration = false;
					currentView.println("----Выход из программы!----");
					break;
				case LIST:
					updateView();
					break;
				case DELETE:
					String deleteId = currentView.prompt("Введите номер студента, которого нужно удалить:");
					if (model.deleteStudent(Long.parseLong(deleteId))) {
						currentView.println("Студент успешно удален!");
						updateView();
					} else {
						currentView.println("Студент с указанным номером не найден!");
					}
					break;
				case LANGUAGE:
					String lang = currentView.prompt("Select language (rus/eng): ");
					switchLanguage(lang);
					updateView();
					break;
			}
		}
	}
}
