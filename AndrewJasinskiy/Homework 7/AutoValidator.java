package HW_7;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoValidator {

    private static final String BRAND_PATTERN = "[A-Z,a-z]{1,}[a-z,0-9]{1,}";
    private static final String BRAND_MODEL_PATTERN = "[A-Z,a-z,0-9]{1,}[a-z,0-9]{1,}";
    private static final String COLOR_PATTERN = "[A-Z,a-z]{1,}[a-z]{1,}";
    private static final String PRICE_PATTERN = "\\s*\\d{1,}\\.\\d{1,}";

    public static boolean validInputAuto(String[] value) throws AutoFormatException{
        if (value.length != 5) {
            throw new AutoFormatException(ErrorsList.INVALID_FULL_INPUT_VALUE);
        }
        if (!validBrand(value[0])) {
            throw new AutoFormatException(ErrorsList.INVALID_BRAND);
        } else if (!validBrandModel(value[1])) {
            throw new AutoFormatException(ErrorsList.INVALID_BRAND_MODEL);
        } else if (!validColor(value[2])) {
            throw new AutoFormatException(ErrorsList.INVALID_COLOR);
        } else if (!isValidYear(value[3])) {
            throw new AutoFormatException(ErrorsList.INVALID_YEAR);
        }
        else if (!isValidPrice(value[4])) {
            throw new AutoFormatException(ErrorsList.INVALID_PRICE);
        }
        return true;
    }

    public static boolean validBrand (String brand) {
        if(isValidInputValue(brand, BRAND_PATTERN)){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean validBrandModel (String brand) {
        if(isValidInputValue(brand, BRAND_MODEL_PATTERN)){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean validColor (String brand) {
        if(isValidInputValue(brand, COLOR_PATTERN)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValidYear(String year) {
        if (Integer.parseInt(year) < 2016 && Integer.parseInt(year) > 1885){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isValidPrice(String price) {
        Pattern p = Pattern.compile(PRICE_PATTERN);
        Matcher m = p.matcher(price);
        if(m.find()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValidInputValue(String string, String regexp){
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(string);
        return m.matches();
    }
}
