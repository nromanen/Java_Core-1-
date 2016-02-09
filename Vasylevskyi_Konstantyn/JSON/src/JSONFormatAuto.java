import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by Smart on 09.02.2016.
 */
public class JSONFormatAuto implements IOAuto {
    private static final ObjectMapper mapper = new ObjectMapper();
    /**@exception
     *  Auto in file, if arg is file name;
     */
    @Override
    public void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(new File(file), auto);
    }

    @Override
    public Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException {
        return  mapper.readValue(new File(file), Auto.class);
    }

    @Override
    public void writeAutos(String file, Collection<Auto> auto) throws JsonGenerationException, JsonMappingException, IOException {
        mapper.writeValue(new File(file), auto);
    }

    @Override
    public Collection readAutos(String file) throws JsonParseException, JsonMappingException, IOException {
        return  mapper.readValue(new File(file), Collection.class);
    }
}
