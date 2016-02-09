import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.util.Collection;
/**
 * Created by Smart on 07.02.2016.
 */
public interface IOAuto {

        void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException;
        Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException;
        void writeAutos(String file, Collection<Auto> auto) throws JsonGenerationException, JsonMappingException, IOException;
        Collection readAutos(String file) throws JsonParseException, JsonMappingException, IOException;


}
