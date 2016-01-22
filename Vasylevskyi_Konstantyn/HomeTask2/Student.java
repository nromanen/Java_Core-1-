

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String fullName ;
    private Calendar graduationYear;
    // TODO DateTime from jodatime
    private Calendar birthDate;

    public Student(){
    }
    public Student(String firstName, String lastName, Calendar birthDate,Calendar graduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.graduationYear = graduationYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFullName() {

            fullName = firstName + " " + lastName;

        return  fullName;
    }


    public Calendar getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Calendar graduationYear) {
        this.graduationYear = graduationYear;
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
        if (getFullName() == null) {
            if (other.getFullName() != null)
                return false;
        } else if (!getFullName().equals(other.getFullName()))
            return false;
        return true;
    }

    public String toString() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY MM dd");
        return  firstName + " " +lastName +"( "
                + dateFormat.format(birthDate.getTime()) + ")" ;

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
