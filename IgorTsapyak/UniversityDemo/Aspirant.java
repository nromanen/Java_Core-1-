package university;


public class Aspirant extends Student {

    private int secondGraduationYear;


    public Aspirant(Student st, int seconGraduationYear){
        firstName = st.firstName;
        lastName = st.lastName;
        birthDate = st.birthDate;
        graduationYear = st.graduationYear;
        secondGraduationYear = seconGraduationYear;
    }

    public void setSecondGraduationYear(int secondGraduationYear) {
        this.secondGraduationYear = secondGraduationYear;
    }

    public int getSecondGraduationYear() {

        return secondGraduationYear;
    }
}
