
public class nromanen2 {

    public static void main(String[] args) {

        int counter = 10;
        int var = 1023669874;
        int resultVar;
        int lenghtOfint = 10;
        int var1 = 0;
        int var2 = 0;
        int[] array1 = new int[lenghtOfint];
        for (int i = 0; i < lenghtOfint; i++) {
            resultVar = var % counter;
            var = var / counter;
            array1[i] = resultVar;
            if (array1[i]%2 == 0)
                var1 += array1[i];
            if (array1[i]%2!=0)
                var2 +=array1[i];
            System.out.print(array1[i]);
        }
        System.out.println();
        System.out.println(var1);
        System.out.println(var2);
    }


}
