package HW_6;

import org.apache.commons.lang.StringUtils;
import java.util.*;

public class AutoConstructor {

    private static final String INPUT_PATTERN = "\\.*,\\s";

    public static Set<Auto> readInputValuesFromConsole(String value) throws AutoFormatException{
            Set<Auto> automobilesSet = new HashSet<>();
            String[] stringCar = StringUtils.split(value, ", ;[]()");
            List<String> automobilesList = Arrays.asList(stringCar);

            try {
                if (AutoValidator.validInputAuto(value.split(INPUT_PATTERN))) {
                    automobilesSet.add(Auto.newBuilder()
                            .setBrand(automobilesList.get(0))
                            .setBrandModel(automobilesList.get(1))
                            .setColor(automobilesList.get(2))
                            .setYear(Integer.parseInt(automobilesList.get(3)))
                            .setPrice(Double.parseDouble(automobilesList.get(4)))
                            .build());
                }
            } catch (AutoFormatException e) {
                e.inputFormatException();
            }
            return automobilesSet;
    }
}
