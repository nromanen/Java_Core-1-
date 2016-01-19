/**
 * Для заданого масиву просумувати всі додатні числа, від'ємні перемножити.
 */
public class ArrayPlusAndMultiplication {
    public static void main(String[] args) {
        int array1[] = new int[]{10,-5,69,98,-6,12,-7};
        int negativeInt = 1;
        int positiveInt = 0;
        int res = 0;

        while (res < array1.length)
        {
            if (array1[res]<0){
                negativeInt*=array1[res];
            }else
            positiveInt+=array1[res];
            res+=1;
        }
        System.out.println(negativeInt);
        System.out.println(positiveInt);
    }
}
