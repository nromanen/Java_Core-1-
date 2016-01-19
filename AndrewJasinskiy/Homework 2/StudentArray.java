//Створити масив, що буде містити інформацію про прізвища студентів. Відсортуйте його спочатку за зростанням, потім – за спаданням

package HW_2;

public class StudentArray {

     public static void main(String[] args) {
        String[] students = {"Андрій", "Микола", "Валентин", "Назар", "Богдан", "Юля", "Олена"};
        int a;
        int b;
        String t;

       //bubble sort
        for(a = 1;a<students.length; a++) {
            for(b = students.length-1; b>=a; b-- ) {
                if(students[b-1].compareTo(students[b])>0){
                    t = students[b-1];
                    students[b-1] = students[b];
                    students[b] = t;
                }
            }
        }

        System.out.println("Sorted array is: ");
        for(int i = 0; i<students.length; i++){
            System.out.println(" " + students[i]);
        }

        //reverse array
        System.out.println("Reversed array is: ");
        for (int i = 0, j = students.length - 1;i<students.length;i++) {
            students[i] = students[j--];
            System.out.println(" " + students[i]);
        }
    }
}




