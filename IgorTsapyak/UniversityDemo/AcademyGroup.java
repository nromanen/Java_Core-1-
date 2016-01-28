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

	public List<Student> groupSort(GroupSortedBy gsb, SortOrder so){
		ArrayList<Student> students = new ArrayList<>(this.getStudents());
		switch (gsb) {
			case FIRST_NAME:
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getFirstName().compareTo(o2.getFirstName());
					}
				});
				break;
			case LAST_NAME:
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.lastName.compareTo(o2.getLastName());
					}
				});
				break;
			case BIRTH_DATE:
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getBirthDate().compareTo(o2.getBirthDate());
					}
				});
				break;
			case AGE:
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getAge()-o2.getAge();
					}
				});
				break;
			case GRADUATION_YEAR:
				Collections.sort(students, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getGraduationYear()-o2.getGraduationYear();
					}
				});
			}
				if (so == so.DESC){
					Collections.reverse(students);
				}
			return students;
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
			 @Override public int compare(Student st1, Student st2){
				 return st2.getAge() - st1.getAge();}});
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
			sb.append(st);
		}
		return sb.toString();
	}
}
