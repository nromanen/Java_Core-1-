package university;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Student {
    protected String firstName;

    protected String lastName;

    protected DateTime birthDate;

    protected int graduationYear;

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

//    public String getFullName(){
//        String fullName = lastName+firstName;
//        return fullName;
//    }


    public String getFullName() {
        String fullName = (lastName+firstName);
        return fullName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((getFullName() == null) ? 0 : getFullName().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student)obj;
        String otherFullName = other.firstName + other.lastName;
        return getFullName().equals(otherFullName);
    }
}


