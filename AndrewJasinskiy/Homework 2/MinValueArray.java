//Для заданої послідовності чисел знайти максимальне і мінімальне від’ємне число.
//Об'єднав 2 завдання в одне, оскільки умова дуже схожа.

package HW_2;

import java.util.Arrays;

public class MinValueArray {

    public static void main(String[] args) {
        int[] numbers = {4, 66, -88, -59,-345,-1,0,-2345,345,-23,-344,-4,-345};
        int maxNegative = 0;
        int minNegative = 0;
        Arrays.sort(numbers);
        for(int i = 0;i < numbers.length; i++ ) {
            if (maxNegative > numbers[i]) {
               maxNegative = numbers[i];
            }
            if(numbers[i]<0) minNegative = numbers[i];
        }

        System.out.println("Maximum negative number in our array equals " + maxNegative);
        System.out.println("Minimum negative number in our array equals " + minNegative);
    }
}





