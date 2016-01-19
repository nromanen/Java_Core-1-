//Для заданого масиву просумувати всі додатні числа, від’ємні - перемножити

package HW_2;

public class ArrayDouble {

         public static void main(String[] args) {
            int[] numbers = {-1434,1,2,1,1,-3,-2,-3,-4,-444};
            int sumPosNumbers = 0;
            int multNegNumbers = 1;
             for(int element : numbers) {
                 if(element>0) {
                     sumPosNumbers+=element;
                 }
                 else{
                     multNegNumbers*=element;
                 }
             }
             System.out.println("Positive numbers sum is " + sumPosNumbers);
             System.out.println("Negative numbers multiplication is " + multNegNumbers);
         }
}
