package ua.com.juja.core.labs.labs.labs;

/**
 * Created by 1 on 18.01.2016.
 */
public class FindChar {
    public static void main(String[] args) {
        String txt = "qwerrty";
        char chr = 'r';
        int count = 0;
        char[] chArray = txt.toCharArray();

        for (int i = 1; i <= chArray.length-1 ; i++ ) {
            if (chArray[i]==chr)
                count++;
            }
        System.out.print(count);
    }
}
