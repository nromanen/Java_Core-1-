/**
 * Для заданого рядка і символа дати відповідь: чи зустрічається цей символ у рядку.
 */
public class characterChecker {

    public static void main(String[] args) {
        String words = "fabulapatusheba";
        char fchar = 'a';
        int counter = 0;
        int charCount = 0;

        while (counter<words.length()){
            if (words.charAt(counter)==fchar){
                charCount +=1;
            }
            counter++;
        }
        System.out.println("We can meet character " + fchar + " in this string " + charCount + " Times");
    }

}
