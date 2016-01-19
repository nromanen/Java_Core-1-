/**
 * Для заданої послідовності чисел знайти мінімальне від’ємне число.
 */
public class minNegativeNum {
    public static void main(String[] args) {
        int[] array1 = new int[]{-112, 12, -5, -58, -111, 45, 47, -255, -1};
        int counter;
        int minVal = 0;

        for (counter = 0; counter < array1.length; counter++){
            if (array1[counter]<0&&array1[counter]>minVal){
                minVal = array1[counter];
            }
            if (minVal==0){
                minVal = array1[counter];
            }
        }
        System.out.println(minVal);
    }

}