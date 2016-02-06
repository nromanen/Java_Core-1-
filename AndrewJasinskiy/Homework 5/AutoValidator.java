package HW_5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static HW_5.Utils.isValidString;

public class AutoValidator {

    private static final String MODEL_PATTERN = "\"[A-Z]{1}[a-z]{1,}\"";
    private static final String YEAR_PATTERN = "\\d{4}";
    private static final String PRICE_PATTERN = "^\\$\\s*\\d{1,}\\.\\d{1,}";
    private static final String INPUT_PATTERN = "(.*),\\s(.*),\\s(.*)";





    public static boolean isValidYear(String year) {
        if (Integer.parseInt(year) < 2016 || Integer.parseInt(year) > 1885) return true;
        else return true;
    }




        public static String[] errors(String autoRepresentation) {
        String[] result = new String[3];

        Pattern pattern = Pattern.compile(INPUT_PATTERN);
        Matcher matcher = pattern.matcher(autoRepresentation);




        if (matcher.matches()) {
            if (isValidString(matcher.group(1), MODEL_PATTERN)) {
                result[0] = "";
            } else {
                result[0] = "Wrong Car title";
            }
            if (isValidYear(matcher.group(2))){
                result[1] = "";
            } else {
                result[1] = "Wrong Year format";
            }
            if (isValidString(matcher.group(3), PRICE_PATTERN)) {
                result[2] = "";
            } else {
                result[2] = "Wrong Price format";
            }
        }
        else result=null;

        return result;
    }

}
