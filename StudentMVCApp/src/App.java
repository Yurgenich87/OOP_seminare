import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;

import Model.Student;
import View.View;

public class App {
	public static void main(String[] args) throws Exception {

		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Лена", "Незабудкина", 23, (long) 104);
		Student s2 = new Student("Александр", "Иванов", 20, (long) 101);
		Student s3 = new Student("Мария", "Петрова", 21, (long) 102);
		Student s4 = new Student("Иван", "Сидоров", 22, (long) 103);
		Student s5 = new Student("Ксения", "Козлова", 19, (long) 105);
		Student s6 = new Student("Артем", "Федоров", 18, (long) 106);
		Student s7 = new Student("Екатерина", "Морозова", 20, (long) 107);
		Student s8 = new Student("Максим", "Григорьев", 19, (long) 108);
		Student s9 = new Student("Алина", "Кузнецова", 21, (long) 109);
		Student s10 = new Student("Денис", "Новиков", 22, (long) 110);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);

		FileRepo fileRepo = new FileRepo("StudentDb.txt");
		// for(Student pers :students)
		// {
		// fileRepo.addStudent(pers);
		// }
		// fileRepo.saveAllStudentToFile();

		iGetModel model = new Model();
		iGetModel modelFileRepo = fileRepo;

		iGetView view = new View();
		Controller control = new Controller(view, modelFileRepo);

		long studentId = 110;
		Student student = fileRepo.findStudent(studentId);

		control.run();
		// control.updateView();
	}
}
