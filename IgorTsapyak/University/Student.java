package university;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.omg.CORBA.portable.Streamable;

public class Student implements Comparable<Student> {
    private String firstName;

    private String lastName;

    private DateTime birthDate;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGraduationYear(DateTime graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getLastName() {

        return lastName;
    }

    public DateTime getGraduationYear() {
        return graduationYear;
    }

    private DateTime graduationYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
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
        String fullName = firstName+lastName;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student)obj;
        String otherFullName = other.firstName + other.lastName;
        return fullName.equals(otherFullName);
    }

    public String toString() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy MM dd");
        return lastName + " " + firstName + " " + "(" + birthDate.toString(fmt) + ")";


    }

    public int getAge() {
        DateTime date = new DateTime();
        long l = date.getMillis() - birthDate.getMillis();
        return (date.withMillis(l).getYear()) - 1970;
    }

        public int compareTo(Student o) {
            return (int) (birthDate.getMillis() - o.birthDate.getMillis());
        }
}


