

import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestMain {

    public static void main(String... args) {

        Calendar calendar = Calendar.getInstance();


        calendar.set(1995, Calendar.JANUARY, 1);
        Student st1 = new Student();
        st1.setBirthDate(calendar);
        calendar = Calendar.getInstance();
        calendar.set(1985, Calendar.MAY, 12);
        st1.setGraduationYear(calendar);
        st1.setFirstName("AVanya");
        st1.setLastName("Vasilenko");


        calendar = Calendar.getInstance();
        calendar.set(1996, Calendar.JANUARY, 23);
        Student st2 = new Student();
        st2.setBirthDate(calendar);
        calendar = Calendar.getInstance();
        calendar.set(1986, Calendar.MAY, 12);
        st2.setGraduationYear(calendar);
        st2.setFirstName("Olya");
        st2.setLastName("Vasylevska");
        System.out.println(st1.toString() + st2);

        Set<Student> students = new LinkedHashSet<>();
        students.add(st1);
        students.add(st2);

        AcademyGroup group = new AcademyGroup();
        group.setTitle("First Group");
        group.setStudents(students);

        calendar = Calendar.getInstance();
        Student st3 = new Student();
        calendar.set(1990, Calendar.APRIL, 1);
        st3.setBirthDate(calendar);
        calendar = Calendar.getInstance();
        calendar.set(1987, Calendar.JANUARY, 12);

        st3.setGraduationYear(calendar);
        st3.setFirstName("AOlya");
        st3.setLastName("Kulish");
        group.addStudent(st3);

        System.out.println("*************");
        System.out.println(group);

        System.out.println("************* Filter By Graduation Year **************");
        System.out.println(group.getStudentByGraduationYear(1987));

        System.out.println("************* Sort By Age **************");
        System.out.println(group.sortedByAge());

        System.out.println("************* Sort By Date of BirthDay **************");
        System.out.println(group.sortedByBirthDate());

        System.out.println("************* Sort By FirstName **************");
        System.out.println(group.sortedByName());



    }
}
