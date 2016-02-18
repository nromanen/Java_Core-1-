import java.util.Arrays;
/**
 * Створити масив, що буде містити інформацію про прізвища студентів. Відсортуйте його спочатку за зростанням, потім – за спаданням
 */
public class arraySort {

    public static void main(String[] args) {

        String sureNames[] = {"Tsapyak","Krivoruchko","Kinaschuk","Andriychuk","Topalo","Magar"};
        Arrays.sort(sureNames);
        int counter = 0;
        while (counter < sureNames.length ){
            System.out.println(sureNames[counter]);
            counter++;
        }
        System.out.println("===========");
        counter = sureNames.length-1;
        while (counter >= 0){
            System.out.println(sureNames[counter]);
            counter--;
        }

    }


}
