//Для заданого числа знайти n!.
package HW_2;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter any number:");
        String num = in.nextLine();
        try {
            int stringToNumber = Integer.parseInt(num);
            System.out.print("Factorial " + stringToNumber + " is equal " + factorial(stringToNumber));
        }catch(NumberFormatException e) {
            System.out.println("Invalid format number!");
        }
    }
}













