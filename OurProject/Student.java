package university;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Student {
    private String firstName;

    private String lastName;

    private DateTime birthDate;

    private int graduationYear;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String toString() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy MM dd");
        return lastName + " " + firstName + " (" + birthDate.toString(fmt) + ")";

    }

    public int getAge() {
        DateTime date = new DateTime();
        return Years.yearsBetween(birthDate, date).getYears();
    }

    @Override
    public int hashCode() {
        String fullName = firstName+lastName;
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((fullName == null) ? 0 : fullName.hashCode());
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
}


