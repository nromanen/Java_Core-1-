//Замінити всі нулі в числі на цифру 9.

package HW_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter any number:");
        String num = in.nextLine();
        int stringToNumber = 0;
        String numAfterReplace = "";
        try {
            stringToNumber = Integer.parseInt(num);
            System.out.println("You enter number - " + stringToNumber);
            for (int i = 0; i < num.length(); i++) {
                int a = Character.getNumericValue(num.charAt(i));
                if(a==0)a=9;
                numAfterReplace += Integer.toString(a);
            }
           System.out.println("After replacing all 0 to 9 the number is equal " + numAfterReplace);
        }catch(NumberFormatException e) {
            System.out.println("Invalid format number!");
        }
    }
}
