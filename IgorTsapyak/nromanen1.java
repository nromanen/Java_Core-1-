/* Порахувати добуток цифр n-значного числа.*/

public class nromanen1 {

    public static void main(String[] args) {

        int counter = 10;
        int var = 22596;
        int resultVar;
        int lenghtOfint = 5;
        int var1 = 1;
        int[] array1 = new int[lenghtOfint];
        for (int i = 0; i < array1.length; i++) {
            resultVar = var % counter;
            var = var / counter;
            array1[i] = resultVar;
            var1 *= array1[i];
        }
        System.out.println(var1);

        }




    }

