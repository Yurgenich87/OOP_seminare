import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
	public static void main(String[] args) throws Exception {

		Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
		Emploee person2 = new Emploee("Петров", "Андрей", 30, 75);
		Emploee person3 = new Emploee("Сидорова", "Елена", 40, 90);
		Emploee person4 = new Emploee("Козлов", "Дмитрий", 25, 65);
		Emploee person5 = new Emploee("Смирнова", "Мария", 35, 80);

		User u1 = new User("Сергей", "Иванов", 25);
		User u2 = new User("Анна", "Петрова", 30);
		User u3 = new User("Михаил", "Сидоров", 42);
		User u4 = new User("Елена", "Кузнецова", 28);
		User u5 = new User("Дмитрий", "Новиков", 35);
		User u6 = new User("Ольга", "Васильева", 21);

		Student s1 = new Student("Сергей", "Иванов", 22, (long) 101);
		Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
		Student s3 = new Student("Иван", "Петров", 22, (long) 121);
		Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
		Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
		Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
		Student s7 = new Student("Кирилл", "Соколов", 21, (long) 202);
		Student s8 = new Student("Анастасия", "Попова", 20, (long) 303);
		Student s9 = new Student("Максим", "Кузнецов", 24, (long) 215);
		Student s10 = new Student("Александра", "Иванова", 21, (long) 117);
		Student s11 = new Student("Никита", "Королев", 22, (long) 512);
		Student s12 = new Student("Татьяна", "Смирнова", 20, (long) 408);
		Student s13 = new Student("Артём", "Белов", 23, (long) 609);
		Student s14 = new Student("Владислав", "Морозов", 21, (long) 725);
		Student s15 = new Student("Ольга", "Козлова", 23, (long) 912);
		Student s16 = new Student("Софья", "Ефимова", 20, (long) 623);

		List<Student> listStud1 = new ArrayList<Student>();

		listStud1.add(s1);
		listStud1.add(s2);

		List<Student> listStud2 = new ArrayList<Student>();

		listStud2.add(s3);
		listStud2.add(s4);
		listStud2.add(s5);
		listStud2.add(s6);
		listStud2.add(s7);
		listStud2.add(s8);
		listStud2.add(s9);
		listStud2.add(s10);
		listStud2.add(s11);

		List<Student> listStud3 = new ArrayList<Student>();

		listStud3.add(s12);
		listStud3.add(s13);
		listStud3.add(s14);
		listStud3.add(s15);
		listStud3.add(s16);

		// Создание групп
		StudentGroup group1 = new StudentGroup(listStud1);
		StudentGroup group2 = new StudentGroup(listStud2);
		StudentGroup group3 = new StudentGroup(listStud3);
		// Создание потоков
		StudentSteam stream1 = new StudentSteam(1);
		StudentSteam stream2 = new StudentSteam(2);
		StudentSteam stream3 = new StudentSteam(3);
		// Добавление групп в потоки
		stream1.addStudentGroup(group1);
		stream2.addStudentGroup(group2);
		stream3.addStudentGroup(group3);

		// System.out.println(stream1);
		// System.out.println(stream2);
		// System.out.println(stream3);

		System.out.println(group1.toString());
		System.out.println(group2.toString());
		System.out.println(group3.toString());

		// System.out.println("============= Группа 1 =============");
		// for (Student stud : group1) {
		// System.out.println(stud);
		// }
		// System.out.println("============= Группа 2 =============");
		// for (Student stud : group2) {
		// System.out.println(stud);
		// }
		// System.out.println("============= Группа 3 =============");
		// for (Student stud : group3) {
		// System.out.println(stud);
		// }

		// List<StudentGroup> groups = Arrays.asList(group1, group2, group3);

		// System.out.println("============= сортировка по количеству студентов
		// =============");
		// groups.stream()
		// .sorted()
		// .forEach(System.out::println);

		// System.out.println("============= Сортировка по id группы =============");

		// Comparator.comparingInt(group -> ((StudentGroup)
		// group).getStudents().size());
		// List<StudentGroup> sortedGroups = groups.stream()
		// .sorted(Comparator
		// .comparing(StudentGroup::getId))
		// .collect(Collectors.toList());

		// for (StudentGroup group : sortedGroups) {
		// System.out.println(group);
		// }

		// EmploeeController.paySalary(peron1);

		// Integer studHour[] = { 124, 234, 231, 1, 45 };
		// System.out.println(EmploeeController.mean(studHour));

		// Double emplSalary[] = { 12555.23, 34213.5, 10000.0 };
		// System.out.println(EmploeeController.mean(emplSalary));

	}
}
