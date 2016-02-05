import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AutoCreator {

    private static final String SPLIT_PATTERN = "\\.*,\\s";

    public static Set<Auto> readCarsFromFile(String fileName) throws IOException {
        String s1;
        List<String> carsList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while ((s1 = br.readLine()) != null){
            carsList.add(s1);
        }
        Set<Auto> autosSet = new HashSet<>();
            for (int i = 0; i<carsList.size(); i++) {
                try {
                    if (AutoValidator.validInputAuto(carsList.get(i).split(SPLIT_PATTERN), i + 1)) {
                        autosSet.add(new AutoBuilder()
                                .setCarBrand(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carBrand])
                                .setModel(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carModel])
                                .setColour(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carColour])
                                .setYear(Integer.parseInt(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carYear]))
                                .setPrice(Double.parseDouble(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carPrice].substring(1)))
                                .build());
                    }
                }catch (InavalidInputedValueException e){
                    e.printStackTrace();
                }
                }

        return autosSet;
    }

}

