package university;

import org.joda.time.DateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import university.Session.ControlType;

public class TestMain {

	public static void main(String... args) {

		Student st1 = new StudentBuilder()
				.firstName("Igor")
				.lastName("Tsapyak")
				.birthDate(new DateTime(1991,3,18,0,0))
				.graduationYear(2010)
				.build();

		Student st2 = new StudentBuilder()
				.firstName("Anton")
				.lastName("Kruvoruchko")
				.birthDate(new DateTime(1992,3,10,0,0))
				.graduationYear(2010)
				.build();

		Student st3 = new StudentBuilder()
				.firstName("Vasul")
				.lastName("Andriychuk")
				.birthDate(new DateTime(1991,6,25,0,0))
				.graduationYear(2010)
				.build();

		Student asp1 = new StudentBuilder()
				.firstName("Igor")
				.lastName("Tsapyak")
				.birthDate(new DateTime(1990,2,26,0,0))
				.graduationYear(2010)
				.build();

		Aspirant as1 = new Aspirant(asp1,2015);


		Set<Student> students = new LinkedHashSet<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);

		AcademyGroup firstGroup = new AcademyGroup();
		firstGroup.setTitle("FirstGroup");
		firstGroup.setStudents(students);

		printSortedStudents(firstGroup,GroupSortedBy.AGE,SortOrder.ASC);

		Session session = new Session();
		session.setTitle("Winter 2016");


		Map<String, ControlType> subjectsForFirstSession = new HashMap<>();
		subjectsForFirstSession.put("Mathematics", ControlType.EXAM);
		subjectsForFirstSession.put("Chemistry", ControlType.TEST);
		subjectsForFirstSession.put("History", ControlType.EXAM);

//		session.setSubjects(subjectsForFirstSession);
//
//		SessionResult sr = new SessionResult();
//		sr.setGroup(firstGroup);
//		sr.setSession(session);
//		sr.setMark("Mathematics",st1,5);
//		sr.fillReport();
//
//
//

	}

	public static void printSortedStudents(AcademyGroup gr,
										   GroupSortedBy gsb,
										   SortOrder so)
	{
		switch (gsb){
			case FIRST_NAME:
				System.out.println("**"+gr.getTitle()+"SortedBy"+gsb+"in"+so+"order**\n" +
						gr.groupSort(gsb,so));
				break;
			case LAST_NAME:
				System.out.println("**"+gr.getTitle()+"SortedBy"+gsb+"in"+so+"order**\n" +
						gr.groupSort(gsb,so));
				break;
			case BIRTH_DATE:
				System.out.println("**"+gr.getTitle()+"SortedBy"+gsb+"in"+so+"order**\n" +
						gr.groupSort(gsb,so));
				break;
			case AGE:
				System.out.println("**"+gr.getTitle()+"SortedBy"+gsb+"in"+so+"order**\n" +
						gr.groupSort(gsb,so));
				break;
			case GRADUATION_YEAR:
				System.out.println("**"+gr.getTitle()+"SortedBy"+gsb+"in"+so+"order**\n" +
						gr.groupSort(gsb,so));

		}
	}
}
