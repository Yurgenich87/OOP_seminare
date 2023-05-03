import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Controllers.EmploeeController;
import StudentDomen.AgeComparator;
import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentDomen.UserComparator;
import StudentService.TeacherService;

public class App {
	public static void main(String[] args) throws Exception {

		Emploee person1 = new Emploee("Иван", "Токарев", 52, 50, 15000);
		Emploee person2 = new Emploee("Александра", "Смирнова", 28, 5, 5000);
		Emploee person3 = new Emploee("Дмитрий", "Иванов", 35, 10, 10000);
		Emploee person4 = new Emploee("Елена", "Петрова", 42, 20, 12000);
		Emploee person5 = new Emploee("Артём", "Соколов", 31, 7, 7000);
		Emploee person6 = new Emploee("Надежда", "Козлова", 45, 15, 11000);
		Emploee person7 = new Emploee("Максим", "Громов", 29, 3, 4500);

		// Создание списка работников
		List<Emploee> listemploees = new ArrayList<Emploee>();

		// Добавление работников в список
		listemploees.add(person1);
		listemploees.add(person2);
		listemploees.add(person3);
		listemploees.add(person4);
		listemploees.add(person5);
		listemploees.add(person6);
		listemploees.add(person7);

		System.out.println("============= Список работников =============");
		for (Emploee emploees : listemploees) {
			System.out.println(emploees.toString());
		}

		Teacher teacher1 = new Teacher("Иван", "Кузнецов", 34, 100, "Бакалавр");
		Teacher teacher2 = new Teacher("Анна", "Петрова", 42, 200, "Магистр");
		Teacher teacher3 = new Teacher("Дмитрий", "Иванов", 29, 150, "Бакалавр");
		Teacher teacher4 = new Teacher("Елена", "Соколова", 51, 300, "Доктор наук");
		Teacher teacher5 = new Teacher("Кирилл", "Михайлов", 37, 120, "Магистр");
		Teacher teacher6 = new Teacher("Марина", "Николаева", 45, 250, "Доктор наук");
		Teacher teacher7 = new Teacher("Игорь", "Козлов", 31, 80, "Бакалавр");
		Teacher teacher8 = new Teacher("Наталья", "Григорьева", 48, 180, "Магистр");
		Teacher teacher9 = new Teacher("Александр", "Семенов", 39, 220, "Доктор наук");
		Teacher teacher10 = new Teacher("Оксана", "Борисова", 28, 90, "Бакалавр");

		// Создание списка преподавателей
		List<Teacher> listTeacher = new ArrayList<Teacher>();

		listTeacher.add(teacher1);
		listTeacher.add(teacher2);
		listTeacher.add(teacher3);
		listTeacher.add(teacher4);
		listTeacher.add(teacher5);
		listTeacher.add(teacher6);
		listTeacher.add(teacher7);
		listTeacher.add(teacher8);
		listTeacher.add(teacher9);
		listTeacher.add(teacher10);

		System.out.println("============= Отсортировано по имени =============");
		// Сортировка по именам
		Collections.sort(listTeacher, new UserComparator<Teacher>());

		for (Teacher teacher : listTeacher) {
			System.out.println(teacher.toString());
			// Teacher.resetCounter();
		}

		// Сортировка по возврасту
		System.out.println("============= Отсортировано по возврасту =============");

		Collections.sort(listTeacher, new AgeComparator<Teacher>());
		// Сброс переменной, для начала нумерации с 1
		Teacher.resetCounter();
		for (Teacher teacher : listTeacher) {
			System.out.println(teacher);
		}
		// for (StudentGroup group : sortedGroups) {
		// System.out.println(group);
		// Student.resetCounter();
		// }
		// Создание списка студентов
		Student s1 = new Student("Василий", "Куприянов", 19, 200);
		Student s2 = new Student("Анна", "Соколова", 20, 210);
		Student s3 = new Student("Дмитрий", "Иванов", 21, 170);
		Student s4 = new Student("Екатерина", "Петрова", 18, 180);
		Student s5 = new Student("Артем", "Козлов", 20, 190);
		Student s6 = new Student("Наталья", "Николаева", 19, 200);
		Student s7 = new Student("Иван", "Громов", 21, 190);
		Student s8 = new Student("Ольга", "Семенова", 18, 180);
		Student s9 = new Student("Алексей", "Борисов", 20, 195);
		Student s10 = new Student("Виктория", "Кузнецова", 21, 175);
		Student s11 = new Student("Илья", "Михайлов", 19, 200);
		Student s12 = new Student("Мария", "Козлова", 18, 185);
		Student s13 = new Student("Александр", "Соколов", 20, 195);
		Student s14 = new Student("Антон", "Николаев", 21, 180);
		Student s15 = new Student("Светлана", "Иванова", 19, 195);
		Student s16 = new Student("Максим", "Петров", 18, 185);
		Student s17 = new Student("Евгения", "Кузьмина", 21, 170);
		Student s18 = new Student("Игорь", "Григорьев", 19, 200);
		Student s19 = new Student("Надежда", "Семенова", 20, 190);
		Student s20 = new Student("Кирилл", "Борисов", 21, 180);

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
		listStud1.add(s12);
		listStud1.add(s13);

		List<Student> listStud3 = new ArrayList<Student>();

		listStud3.add(s14);
		listStud3.add(s15);
		listStud3.add(s16);
		listStud3.add(s17);
		listStud3.add(s18);
		listStud3.add(s19);
		listStud3.add(s20);

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

		// System.out.println("============= Список студентов =============");
		// System.out.println("================= Группа 1 =================");
		// for (Student stud : group1) {
		// System.out.println(stud);
		// }
		// System.out.println("================= Группа 2 =================");
		// for (Student stud : group2) {
		// System.out.println(stud);
		// }
		// System.out.println("================= Группа 3 =================");
		// for (Student stud : group3) {
		// System.out.println(stud);
		// }

		List<StudentGroup> groups = Arrays.asList(group1, group2, group3);

		// System.out.println("============= сортировка по количеству студентов
		// =============");

		// int counter1 = 1;
		// groups.stream()
		// .sorted()
		// .forEach(group -> System.out.println(counter1++ + ". " + group));

		System.out.println("============= Сортировка по id группы =============");

		List<StudentGroup> sortedGroups = groups.stream()
				.sorted(Comparator.comparing(StudentGroup::getId))
				.collect(Collectors.toList());

		for (StudentGroup group : sortedGroups) {
			System.out.println(group);
			Student.resetCounter();
		}

		System.out.println("============= Средний возвраст =============");

		// Cортировка среднего возвраста студентов
		AverageAge<Student> studentAge = new AverageAge<>();
		double avgStudentAge = studentAge.calculateAverageAge(listStud3);
		System.out.println("Средний возвраст студентов: " + avgStudentAge);

		// Cортировка среднего возвраста преподавателей
		AverageAge<Teacher> teacherAge = new AverageAge<>();
		double avgTeacherAge = teacherAge.calculateAverageAge(listTeacher);
		System.out.println("Средний возвраст преподавателей: " + avgTeacherAge);

		// Cортировка среднего возвраста работников
		AverageAge<Emploee> employeeAge = new AverageAge<>();
		double avgEmployeeAge = employeeAge.calculateAverageAge(listemploees);
		System.out.println("Средний возвраст работников: " + avgEmployeeAge);

	}
}