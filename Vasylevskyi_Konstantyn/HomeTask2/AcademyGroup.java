
import java.util.*;

public class AcademyGroup {
    private String title;
    private Set<Student> students = new HashSet<>(); // why set

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> sortedByBirthDate() {
        List<Student> listStudents = new ArrayList<>(students);

        Collections.sort(listStudents);

        return listStudents;
    }

    public List<Student> sortedByAge() {
        List<Student> listStudents = new ArrayList<>(students);
        Collections.sort(listStudents, new Comparator<Student>(){
            @Override public int compare(Student st1, Student st2){return st1.getAge() - st2.getAge();}});
        return listStudents;
    }

    public List<Student> sortedByName() {
        List<Student> listStudents = new ArrayList<>(students);

        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student oneStudent, Student otherStudent) {
                return oneStudent.getFirstName().compareTo(
                        otherStudent.getFirstName());
            }
        });

        return listStudents;
    }
  /*  public List<Student> sortedByGraduationDate(){
        List<Student> listStudents = new ArrayList<>(students);
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getGraduationYear().compareTo(st2.getGraduationYear());
            }
        });
        return listStudents;
    }*/
    public List<Student> getStudentByGraduationYear(int year){
        List<Student> listStudents = new ArrayList<>(students);
        List<Student> list = new ArrayList<>();
        for (Student listStudent : listStudents) {
            if (listStudent.getGraduationYear().get(Calendar.YEAR) == year) {
               list.add(listStudent);
            }
        }
        return list;
        }


    public boolean delete(Student student) {
        return students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(title);
        sb.append(":\n");
        for (Student st : students) {
            sb.append(st).append("\n");
        }
        return sb.toString();
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

}
