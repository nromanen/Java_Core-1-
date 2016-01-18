package ua.com.juja.core.labs.labs;

/**
 * Created by 1 on 17.01.2016.
 */
public class SumDuoble {
    public static void main(String[] args) {
        int InpNum = 909887654;
        int sumDouble = 0;
        int sumOdd = 0;

        while (InpNum != 0) {

            if (InpNum % 2 == 0) {
                sumDouble = sumDouble + (InpNum % 10);
            }
            else {
                sumOdd = sumOdd + (InpNum % 10);
            }
            InpNum /= 10;
        }
        System.out.println(sumOdd);
        System.out.println(sumDouble);

    }
}
