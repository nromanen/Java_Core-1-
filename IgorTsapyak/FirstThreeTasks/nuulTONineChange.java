/**
*Замінити всі нулі в числі на цифру 9.
*/
public class nuulTONineChange {

    public static void main(String[] args) {
        int initialValue = 207890;
        int decPosition = 1;
        int resultValue = 0;
        while (initialValue != 0){
            if (initialValue%10 == 0){
                resultValue+=9 * decPosition;
            }
            else{
                resultValue+=initialValue%10 * decPosition;
            }
            decPosition*=10;
            initialValue/=10;
        }
        resultValue+=initialValue%10 * decPosition;

        System.out.println(resultValue);
    }
}
