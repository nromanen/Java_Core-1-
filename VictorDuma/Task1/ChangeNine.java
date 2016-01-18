package ua.com.juja.core.labs.labs.labs;

/**
 * Created by 1 on 17.01.2016.
 */

// Есть бага. последний єлемент кидает в начало. Не разобрался...
public class ChangeNine {
    public static void main(String[] args) {
        int InpNum = 653008761;
        int a[] = new int[9];
        int temp;
        for (int i = 0; i <= 8; i++) {
            temp = InpNum % 10;
            a[i] = temp;
            if (a[i] == 0)
                a[i] = 9;

            InpNum /= 10; // блок кода для замены 0 на 9

        }
        System.out.println(a[0]);

        int first = 0;
        for (int j = a.length -1; j >=0 ;  j--) {
            int test = a[j];
            a[j] = a[first];
            a[first] = test;
            System.out.print(a[j]); // инвертируем массив.


        }

    }
}

