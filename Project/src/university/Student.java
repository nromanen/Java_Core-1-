package university;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student implements Comparable<Student> {
	private String firstName;
	// TODO DateTime from jodatime
	private Calendar birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}

	public String toString() {

		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY MM dd");
		return "Student [firstName=" + firstName + ", BirthDate="
				+ dateFormat.format(birthDate.getTime()) + "]";

	}

	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		long l = calendar.getTimeInMillis() - birthDate.getTimeInMillis();
		calendar.setTimeInMillis(l);
		return calendar.get(Calendar.YEAR) - 1970;
	}

	@Override
	public int compareTo(Student o) {
		return (int) (birthDate.getTimeInMillis() - o.birthDate
				.getTimeInMillis());
	}
}
