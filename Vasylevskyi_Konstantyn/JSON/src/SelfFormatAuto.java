import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Smart on 09.02.2016.
 */
public class SelfFormatAuto implements IOAuto{
    private static final ObjectMapper mapper = new ObjectMapper();
    @Override
    public void writeAuto(String target, Auto auto) throws JsonGenerationException, JsonMappingException, IOException {
        if ("CONSOLE".equals(target)){
            mapper.writeValue(System.out, auto);
        }
    }

    @Override
    public Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException {
        return null;
    }

    @Override
    public void writeAutos(String target, Collection<Auto> autos) throws JsonGenerationException, JsonMappingException, IOException {
        if ("CONSOLE".equals(target)){
            mapper.writeValue(System.out, autos);
        }
    }

    @Override
    public Collection readAutos(String file) throws JsonParseException, JsonMappingException, IOException {
        return null;

    }
}
