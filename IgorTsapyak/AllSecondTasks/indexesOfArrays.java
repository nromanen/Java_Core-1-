/**
 *Для двовимірного масиву вивести індекси стовпчиків, в яких немає від’ємних елементів.
 */
public class indexesOfArrays {

    public static void main(String[] args) {
        int array1[][] = {
                {2,3,5},
                {3,-5,7},
                {5,7,8}
        };

        for(int i=0; i<array1.length; i++) {
            boolean flag = true;
            for(int j=0; j<array1[i].length; j++){
                if (array1[j][i] < 0) {
                    flag = false;
                    break;
                         }
                     }
            if (flag) System.out.print(i + " ");
                }
            }
         }



        

