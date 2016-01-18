package ua.com.juja.core.labs.labs.labs;

/**
 * Created by 1 on 18.01.2016.
 */
public class MaxNegative {
    public static void main(String[] args) {

        int [] Numbers = {3,2,3,5,-65,-134,-6,-4,67};

        for (int i = 0; i < Numbers.length-1; i++ ) {
            int min = Numbers[i];
            int min_i = i;

            for( int j = i+1; j < Numbers.length-1; j++){
                if(Numbers[j] < min){
                    min = Numbers[j];
                    min_i = j;
                }

            }
            if (i != min_i) {
                int tmp = Numbers[i];
                Numbers[i] = Numbers[min_i];
                Numbers[min_i] = tmp;
            }

        }

        System.out.println(Numbers[0]);
    }
}
