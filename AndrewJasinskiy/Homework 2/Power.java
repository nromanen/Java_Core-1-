//Для двох заданих чисел x та n знайти x^n.


package HW_2;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number:");
        String stringNum = in.nextLine();
        System.out.println("Please enter exponent:");
        String stringExp = in.nextLine();

        try {
            int num = Integer.parseInt(stringNum);
            int exp = Integer.parseInt(stringExp);
            int result = 1;

            for (int i = exp; i>0; i--) {
                result*=num;
            }
            System.out.print(num + " in exponent "+ exp + " is equal to " + result);
        }catch(NumberFormatException e) {
            System.out.println("Invalid format number!");
        }
    }
}
