/**
 * Для заданої послідовності чисел знайти максимальне від’ємне число.
 */
public class maxNegativeNum{

    public static void main(String[] args) {
        int[] array1 = new int[]{-112, 12, -5, -58, -111, 45, 47, -255, 22};
        int counter;
        int maxVal = 0;
        int firstVal = 0;

      for (counter = 0; counter < array1.length; counter++){
          if (firstVal>array1[counter]){
              maxVal = array1[counter];
              firstVal=array1[counter];
          }

      }
        System.out.println(maxVal);
    }

}