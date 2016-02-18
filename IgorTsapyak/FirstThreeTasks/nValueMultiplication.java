/**
 * Знайти добуток n значного числа.
 */

public class nValueMultiplication{

    public static void main(String[] args) {

        int counter = 10;
        int var = 2369;
        int resultVar;
        int outVar = 1;
        do {
        resultVar = var%counter;
        var=var/counter;
        outVar*=resultVar;
            }while (var%counter>0);
        System.out.println(outVar);
        }
    }

