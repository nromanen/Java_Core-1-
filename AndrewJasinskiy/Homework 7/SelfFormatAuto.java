package HW_7;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SelfFormatAuto implements IOAuto {

    private static final String INPUT_PATTERN = "\\.*,\\s";

    FileWriter fl;

    @Override
    public void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException {
        fl = new FileWriter(file, true);
        fl.append(auto.toString().replaceAll("\\w*\\s-\\s", "").replaceAll("\\W0",""));
        fl.flush();
        fl.close();
    }

    @Override
    public void writeAutos(String file, Set<Auto> autos) throws JsonGenerationException, JsonMappingException, IOException {
        fl = new FileWriter(file, true);
        fl.append(autos.toString());
        fl.flush();
        fl.close();
    }

    @Override
    public Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException, AutoFormatException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] stringCar = br.readLine().split(INPUT_PATTERN);
        try{
            if (AutoValidator.validInputAuto(stringCar)){
                return Auto.newBuilder()
                        .setBrand(stringCar[0])
                        .setBrandModel(stringCar[1])
                        .setColor(stringCar[2])
                        .setYear(Integer.parseInt(stringCar[3]))
                        .setPrice(Double.parseDouble(stringCar[4]))
                        .build();
                }
        }catch (AutoFormatException e){
            e.inputFormatException();
        }

        return null;
    }

    @Override
    public Set<Auto> readAutos(String file) throws JsonParseException, JsonMappingException, IOException {

        String st;
        List<String> automobilesList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((st = br.readLine()) != null){
            String tmp = st.replaceAll("\\w*\\s-\\s", "").replaceAll("^(\\[)|^(,\\s)|^(\\s)|(\\])$", "");
            automobilesList.add(tmp);
        }

        Set<Auto> automobilesSet = new HashSet<>();

        for (int i = 0; i<automobilesList.size(); i++) {
            try {
                if (AutoValidator.validInputAuto(automobilesList.get(i).split(INPUT_PATTERN))) {
                    automobilesSet.add(Auto.newBuilder()
                            .setBrand(automobilesList.get(i).split(INPUT_PATTERN)[0])
                            .setBrandModel(automobilesList.get(i).split(INPUT_PATTERN)[1])
                            .setColor(automobilesList.get(i).split(INPUT_PATTERN)[2])
                            .setYear(Integer.parseInt(automobilesList.get(i).split(INPUT_PATTERN)[3]))
                            .setPrice(Double.parseDouble(automobilesList.get(i).split(INPUT_PATTERN)[4]))
                            .build());

                }
            }catch (AutoFormatException e){
                e.inputFormatException();
            }
        }
        return automobilesSet;
    }
}
