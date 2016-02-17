package HW_7;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class JsonFormatAuto implements IOAuto{

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(new File(file), auto);
    }

    @Override
    public void writeAutos(String file, Set<Auto> autos) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(new File(file), autos);
    }

    @Override
    public Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException, AutoFormatException {
        Auto auto = mapper.readValue(new File(file), Auto.class);
        String[] textRepAutto = (auto.toString().replaceAll("\\w*\\s-\\s", "").split("\\.*,\\s"));
        if (!AutoValidator.validInputAuto(textRepAutto)) {
            return null;
        }
        return auto;
    }

    @Override
    public Set<Auto> readAutos(String file) throws JsonParseException, JsonMappingException, IOException {
        List<Auto> automobilesList = new LinkedList<>(mapper.<Collection<Auto>>readValue(new File(file), new TypeReference<List<Auto>>(){}));
        Set<Auto> automobilesSet = new LinkedHashSet<>();
        for (int i = 0; i < automobilesList.size(); i++) {
            String[] textRepAuto = (automobilesList.get(i).toString().replaceAll("\\w*\\s-\\s", "")).replaceAll("\\W0", "").split("\\.*,\\s");
            try {
                if (AutoValidator.validInputAuto(textRepAuto)) {
                    automobilesSet.add(Auto.newBuilder()
                            .setBrand(textRepAuto[0])
                            .setBrandModel(textRepAuto[1])
                            .setColor(textRepAuto[2])
                            .setYear(Integer.parseInt(textRepAuto[3]))
                            .setPrice(Double.parseDouble(textRepAuto[4]))
                            .build());
                }
            } catch (AutoFormatException e) {
                e.inputFormatException();
            }
        }
        return automobilesSet;
    }



}
