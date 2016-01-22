package university;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public List<Student> gyStudents(int gYear){
		List<Student> studentHoGinY = new ArrayList<>();
		for (Student student: students){
			if (student.getGraduationYear()==gYear){
			studentHoGinY.add(student);
			}
		}return studentHoGinY;
	}
}
