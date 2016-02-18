//Для двовимірного масиву вивести індекси стовпчиків, в яких немає від’ємних елментів.

package HW_2;

public class IndexOfArray {

    public static void main(String[] args) {
        int[][] numbers =
                           {{1,-2,-3,-4,-5,-6,7,8},
                            {1, 2,-3,-4,-5,-6,7,8}};
        for(int i = 0; i<numbers[0].length; i++) {
                if(numbers[0][i]>0&& numbers[1][i]>0) {
                    System.out.println("The column number without minus is : " + i);

                }
            }
        }
}



