package ua.com.juja.core.labs.labs;

import java.util.Scanner;

//добуток цифр n значного числа

public class Sum {
    public static void main(String[] args) {
        int InpNum = 898772334;
        int sum = 0;
        while (InpNum != 0){
            sum = sum + (InpNum % 10);
            InpNum /= 10;
        }
        System.out.println(sum);

    }


}
