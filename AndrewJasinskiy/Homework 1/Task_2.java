//Підрахувати суми парних та непарних цифр числа.

package HW_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter any number:");
        String num = in.nextLine();
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int stringToNumber = 0;
        try {
            stringToNumber = Integer.parseInt(num);
            System.out.println("You enter number - " + stringToNumber);
            for (int i = 0; i < num.length(); i++) {
                int a = Character.getNumericValue(num.charAt(i));
                if (a % 2 == 0) {
                    sumEvenNumbers += a;
                } else {
                    sumOddNumbers += a;
                }
            }
            System.out.println("The sum of even numbers is equal" + sumEvenNumbers);
            System.out.println("The sum of odd numbers is equal" + sumOddNumbers);
        }catch(NumberFormatException e) {
            System.out.println("Invalid format number!");
        }
     }
}