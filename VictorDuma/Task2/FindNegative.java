package ua.com.juja.core.labs.labs.labs;

import java.lang.reflect.Array;

/**
 * Created by 1 on 18.01.2016.
 */
public class FindNegative {
    public static void main(String[] args) {
        int [] Numbers = {3,2,3,5,-65,56,-6,-4,67};
        int negative = 1;
        int positive = 0;
        for (int i = 0; i <= Numbers.length-1 ; i++ ) {
            if (Numbers[i] >= 0)
                positive = positive + Numbers[i];
            else
                negative = negative * Numbers[i];
        }
        System.out.println(positive);
        System.out.println(negative);
    }
}
