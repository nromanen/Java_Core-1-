package university;


import org.joda.time.DateTime;

public class StudentBuilder {

    private Student studentInstance = new Student();

    public StudentBuilder firstName(final String firstName){
        studentInstance.setFirstName(firstName);
        return this;
    }
    public StudentBuilder lastName(final String lastName){
        studentInstance.setLastName(lastName);
        return this;
    }
    public StudentBuilder birthDate(final DateTime birthDate){
        studentInstance.setBirthDate(birthDate);
        return this;
    }
    public StudentBuilder graduationYear(final int graduationYear){
        studentInstance.setGraduationYear(graduationYear);
        return this;
    }

    public Student build(){
        return studentInstance;
    }

}
