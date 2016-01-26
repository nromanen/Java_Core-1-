package university;

import java.security.acl.Group;
import java.util.*;

public class AcademyGroup {
	private String title;
	private Set<Student> students = new HashSet<>();

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
		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				return st2.getBirthDate().compareTo(st1.getBirthDate());}});
		return listStudents;
	}

	public List<Student> sortedByAge() {
		List<Student> listStudents = new ArrayList<>(students);
		 Collections.sort(listStudents, new Comparator<Student>(){
			 @Override public int compare(Student st1, Student st2){return st2.getAge() - st1.getAge();}});
			return listStudents;
	}

	public List<Student> sortedByName() {
		List<Student> listStudents = new ArrayList<>(students);

		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student oneStudent, Student otherStudent) {
				return oneStudent.getLastName().compareTo(
						otherStudent.getLastName());
			}
		});
		return listStudents;
	}

	public void deletStudentByFullName(String name){
		Iterator<Student> iter = this.getStudents().iterator();
		while(iter.hasNext()){
			if (iter.next().getFullName().equals(name)){
				iter.remove();
			}
		}
	}

	public boolean addStudent(Student student) {
		return students.add(student);
	}

	public List<Student> graduationYearOfStudent(int graduationYear){
		List<Student> studentWhooGraduatedInthisYear = new ArrayList<>();
		for (Student student: students){
			if (student.getGraduationYear()==graduationYear){
			studentWhooGraduatedInthisYear.add(student);
			}
		}return studentWhooGraduatedInthisYear;
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
}
