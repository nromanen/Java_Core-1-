package university;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import university.Session.ControlType;

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

		Set<Student> students = new HashSet<>();
		students.add(st1);
		students.add(st2);

		AcademyGroup group = new AcademyGroup();
		group.setTitle("First Group");
		group.setStudents(students);

		Student st3 = new Student();
		calendar = Calendar.getInstance();
		calendar.set(1990, 1, 1);
		st3.setBirthDate(calendar);
		st3.setFirstName("!!!AOlya");
		group.addStudent(st3);

		System.out.println("*************");
		System.out.println(group);
		
		
/*		Iterator<Student> iter = group.getStudents().iterator();
		while(iter.hasNext()){
			if (iter.next().getFirstName().equals("!!!AOlya")){
				iter.remove();
			}
		}
		
		
		System.out.println("*************");
		System.out.println(group);
		
*/		

		System.out.println("***S1*******");
		System.out.println(group.sortedByAge());

		System.out.println("****S2********");
		System.out.println(group.sortedByBirthDate());

		Session firstSession = new Session();
		firstSession.setTitle("Winter2016");

		Map<String, ControlType> subjsForFirstSess = new HashMap<>();
		subjsForFirstSess.put("Math.Anal", ControlType.EXAM);
		subjsForFirstSess.put("History", ControlType.TEST);
		subjsForFirstSess.put("Hismical", ControlType.EXAM);

		firstSession.setSubjs(subjsForFirstSess);

		System.out.println(subjsForFirstSess + "\n" + firstSession);

		System.out.println("All exams: \n"
				+ firstSession.getAllSubjectsByType(ControlType.EXAM));

		SessionResult sr = new SessionResult();
		sr.setGroup(group);
		sr.setSession(firstSession);
		sr.fillReport();
		// System.out.println("----------\n");
		// sr.setMark("Math.Anal", st1, 2);
		String testSubj = firstSession.getSubject("his");
		sr.setMarksForSubjectFromConsole(testSubj);

		Car car = new Car("df", 2017);
		System.out.println("----------\n");
		Track track = new Track("er", 2017, 6.7);
		System.out.println(track + "\n" + track.getAge() + "*"
				+ ((Car) track).getAge() + "*" + track.getSuperAge());

		System.out.println(((Car) track).superMeth() + "*" + track.superMeth());

	}
}
