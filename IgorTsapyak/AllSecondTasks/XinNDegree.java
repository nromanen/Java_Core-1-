/**
 Для двох заданих чисел x та n знайти x^n.
 */
public class XinNDegree {

    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        int result = 1;
        int counter = 0;

        while (counter < n){
            result *=x;
            counter++;
        }
        System.out.println(result);
    }
}
