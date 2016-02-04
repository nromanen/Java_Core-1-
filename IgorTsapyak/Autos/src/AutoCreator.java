import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AutoCreator {

    private static final String SPLIT_PATTERN = "\\.*,\\s";

    public static Set<Auto> readCarsFromFile() throws IOException {
        List<String> carsList = takeAutoString();
        Set<Auto> autosSet = new HashSet<>();
            for (int i = 0; i<carsList.size(); i++){
                    if (AutoValidator.validInputAuto(carsList.get(i).split(SPLIT_PATTERN)));
                autosSet.add(new AutoBuilder()
                        .setCarBrand(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carBrand])
                        .setModel(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carModel])
                        .setColour(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carColour])
                        .setYear(Integer.parseInt(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carYear]))
                        .setPrice(Double.parseDouble(carsList.get(i).split(SPLIT_PATTERN)[AutoValidator.carPrice].substring(1)))
                        .build());
                }
        return autosSet;

    }
    public static List<String> takeAutoString() throws IOException {
        String s1;
        List<String> s = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("inputAutos.txt"));
        while ((s1 = br.readLine()) != null){
            s.add(s1);
        }
        return s;
    }
}

