//Для заданого рядка і символа дати відповідь: чи зустрічається цей символ у рядку



package HW_2;

import java.util.Scanner;

public class SearchChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any string:");
        String inputString = in.nextLine();
        System.out.println("And now, enter any symbol:");
        String inputChar = in.nextLine();

        if(inputChar.length()<2) {
            System.out.print("You enter next string - " + inputString);
            System.out.println(" and you want find symbol - " + inputChar);
            String strLowCs = inputString.toLowerCase();
            String symLowCs = inputChar.toLowerCase();
            char sym = symLowCs.charAt(0);
            boolean a = false;
            int countCoincidence = 0;
            for(int i = 0; i<strLowCs.length(); i++) {
                if (strLowCs.charAt(i) == sym) {
                    ++countCoincidence;
                    a = true;
                }
            }
                if (a) {
                    System.out.println("Symbol " + inputChar + " consist in string " + inputString + " " + countCoincidence + " times!");
                }
                 else{
                   System.out.println("Symbol " + inputChar + " doesn't consist in string " + inputString);
                }
        }else{
            System.out.println("Sorry, you must enter only one char!");
        }
    }
}
