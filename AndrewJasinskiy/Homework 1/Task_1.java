//Порахувати добуток цифр n-значного числа.

package HW_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter any number:");
        String num = in.nextLine();
        int a = 1;
        int b = 1;
        int stringToNumber = 0;
        try{
            stringToNumber = Integer.parseInt(num);
            System.out.println("You enter number - " + stringToNumber);
            for(int i = 0; i<num.length(); i++ ) {
                a = Character.getNumericValue(num.charAt(i));
                if(a==0)a=1;
                b*=a;
            }
            System.out.println("Number's " + stringToNumber +  " member Multiplication is " + b);
        } catch(NumberFormatException e) {
            System.out.println("Invalid format number!");
        }
    }
}