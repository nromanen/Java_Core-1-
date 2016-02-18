package university;

import java.io.IOException;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface IOAuto {
	void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException;
	Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException;
	void writeAutos(String file, Collection<Auto> auto) throws JsonGenerationException, JsonMappingException, IOException;
	Collection<Auto> readAutos(String file) throws JsonParseException, JsonMappingException, IOException;

}

