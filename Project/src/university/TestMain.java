package university;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String... args) {

		Calendar calendar = Calendar.getInstance();

		calendar.set(1995, Calendar.JANUARY, 1);

		Student st1 = new Student();
		st1.setBirthDate(calendar);
		st1.setFirstName("AVanya");

		calendar = Calendar.getInstance();

		calendar.set(1996, Calendar.JANUARY, 23);

		Student st2 = new Student();
		st2.setBirthDate(calendar);
		st2.setFirstName("Olya");

		System.out.println(st1.toString() + st2);

		Set<Student> students = new HashSet<>();
		students.add(st1);
		students.add(st2);

		AcademyGroup group = new AcademyGroup();
		group.setTitle("First Group");
		group.setStudents(students);

		Student st3 = new Student();
		calendar.set(1990, 1, 1);
		st3.setBirthDate(calendar);
		st3.setFirstName("AOlya");
		group.addStudent(st3);

		System.out.println("*************");

		System.out.println(group);

		System.out.println("************* Sort By Age **************");

		System.out.println(group.sortedByAge());

		System.out
				.println("************* Sort By Date of BirthDay **************");

		System.out.println(group.sortedByBirthDate());

		System.out.println("************* Sort By FirstName **************");

		System.out.println(group.sortedByName());

	}
}
