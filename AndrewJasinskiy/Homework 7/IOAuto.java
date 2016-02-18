package HW_7;

import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public interface IOAuto {

    void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException;

    void writeAutos(String file, Set<Auto> auto) throws JsonGenerationException, JsonMappingException, IOException;

    Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException, AutoFormatException;

    Set<Auto> readAutos(String file) throws JsonParseException, JsonMappingException, IOException, AutoFormatException;

}
