
public class nromanen3 {

    public static void main(String[] args) {
        int counter = 10;
        int var = 1023069074;
        int resultVar;
        int lenghtOfint = 10;
        int[] array1 = new int[lenghtOfint];
        for (int i = 0; i < lenghtOfint; i++) {
            resultVar = var % counter;
            var = var / counter;
            array1[i] = resultVar;
            System.out.print(resultVar);
            if (array1[i]==0)
                array1[i]=9;
        }
        System.out.println();
        for (int i = 0; i < array1.length;i++){
            System.out.print(array1[i]);
        }
    }
}
