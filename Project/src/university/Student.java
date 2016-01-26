package university;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student // implements Comparable<Student>
{
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
		return "Student " + firstName + " ("
				+ dateFormat.format(birthDate.getTime()) + ")";

	}

	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		long l = calendar.getTimeInMillis() - birthDate.getTimeInMillis();
		calendar.setTimeInMillis(l);
		return calendar.get(Calendar.YEAR) - 1970;
	}

	// @Override
	public int compareTo(Student o) {
		return (int) (birthDate.getTimeInMillis() - o.birthDate
				.getTimeInMillis());
	}
}

class Car {
	protected String model;
	protected int year;
	public static String superField = "Super";

	public static String superMeth() {
		return "superMeth";
	}

	public Car() {
	}

	public Car(String s, int year) {
		model = s;
		this.year = year;
	}

	public int getAge() {
		return year - 2000;
	}

}

class Track extends Car {
	private double height;

	public static String superField = "child";

	public static String superMeth() {
		return "childMeth";
	}

	public Track(String s, int year, double w) {
		super(s, year);
		//this.model=s;
		//this.year=year;
		//super.model = s;
		//model = "dr";
		//this.year = year;
		this.height = w;
	}

	public int getAge() {
		return year - 2010;
	}

	public int getSuperAge() {
		return super.getAge();
	}

	public String toString() {
//Second uncommented
				System.out.println(super.superField + "|||");
		System.out.println(super.superMeth() + "\\\\");

//First uncommented without override in track and with override

		System.out.println(superField + "|||");
		System.out.println(superMeth() + "\\\\");

		return model + " " + year + " " + height;
	}
	
	
}
