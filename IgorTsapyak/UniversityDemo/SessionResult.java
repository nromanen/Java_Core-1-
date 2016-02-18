package university;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SessionResult {

    private Session session;
    private AcademyGroup group;
    private Map<String, Map<Student, Integer>> marks;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public AcademyGroup getGroup() {
        return group;
    }

    public void setGroup(AcademyGroup group) {
        this.group = group;
    }

    public void fillReport(){
        marks = new HashMap<>();
        Map<Student, Integer> students = new HashMap<>();
        for(Student student: group.getStudents()){
            students.put(student, 0);
        }
        for(String subject : session.getAllSubjects()){
            marks.put(subject, students);
        }

        //	System.out.println(marks);
    }

    public boolean setMark(String subject, Student student, Integer mark){
        if (marks == null){
            fillReport();
        }
        if (group.getStudents().contains(student) && session.getSubjects().containsKey(subject)){
            Map<Student, Integer> students = new HashMap<>();
            students.put(student, mark);
            System.out.println(students + "!!!");
            marks.put(subject, students);
        }
//	System.out.println("*** "+marks +"\n ****");
        return true;
    }

    public void setMarksForSubjectFromConsole(String subject) {
        Scanner console =  new Scanner(System.in);
        Map<Student, Integer> students = new HashMap<>();
        for (Student student: group.getStudents()){
            System.out.print(student.getFirstName()+ " : ");
            students.put(student, console.nextInt());
        }
        console.close();
        marks.put(subject, students);
        System.out.println(marks);
    }

}