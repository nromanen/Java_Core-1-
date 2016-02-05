import EnumsForAutos.*;
import org.joda.time.DateTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoValidator {

    private static String cbrand;
    static int carBrand = 1;
    static int carModel = 2;
    static int carColour = 3;
    static int carYear = 4;
    static int carPrice = 5;
    private static final int firstAutoPatentYear=1886;
    private static final String YEAR_PATTERN = "\\$\\d{3,}";

    public static boolean validInputAuto(String[] s, int carId)throws InavalidInputedValueException{
        if (!carBrandChacker(s[carBrand].toUpperCase())){
            throw new InavalidInputedValueException("Invalid Brand in line# " + carId);
        }else if (!carModelChacker(s[carModel].toUpperCase())){
            throw new InavalidInputedValueException("Invalid Model in line# " + carId);
        }else if (!carColourChacker(s[carColour].toUpperCase())){
            throw new InavalidInputedValueException("Invalid Colour in line# " + carId);
        }else if (!carYearChacker(s[carYear])){
            throw new InavalidInputedValueException("Invalid Year in line# " + carId);
        }else if (!carPriceChacker(s[carPrice])){
            throw new InavalidInputedValueException("Invalid Price in line# " + carId);
        }
        return true;
    }

    public static boolean carBrandChacker(String brand){
        for (CarBrands a1: CarBrands.values()) {
            if (a1.toString().equals(brand)) {
                cbrand = brand;
                return true;
            }
        }
        return false;
    }

    public static boolean carModelChacker(String car){
        switch (cbrand){
            case "AUDI":
                for (AudiModels am: AudiModels.values()){
                 if (am.toString().equals(car))
                     return true;
                }
                break;
            case "MERCEDES":
                for (MercedesBenzModels mbm: MercedesBenzModels.values()){
                    if (mbm.toString().equals(car))
                        return true;
                }
                break;
            case "BMW":
                for (BmwModels bmwm: BmwModels.values()){
                    if (bmwm.toString().equals(car))
                        return true;
                }
                break;
            case "OPEL":
                for (OpelModels om: OpelModels.values()){
                    if (om.toString().equals(car))
                        return true;
                }
                break;
        }
       return false;
    }

    public static boolean carColourChacker(String colour){
        for (Colors c: Colors.values()){
            if (c.toString().equals(colour))
                return true;
        }
        return false;
    }

    public static boolean carYearChacker(String year){
        if (Integer.parseInt(year)>DateTime.now().getYear()||Integer.parseInt(year)<firstAutoPatentYear)
            return false;
        return true;
    }

    public static boolean carPriceChacker(String price){

        Pattern p = Pattern.compile(YEAR_PATTERN);
        Matcher m = p.matcher(price);
        if (m.matches()){
            return true;
        }
        return false;
    }

}



