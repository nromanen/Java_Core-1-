package university;

import java.io.IOException;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class AutoService implements IOAuto {

	@Override
	public void writeAuto(String file, Auto auto){
		if ("CONSOLE".equals(file)){
		System.out.println(auto);
			
		}		
	}


	@Override
	public Auto readAuto(String file) throws JsonParseException,
			JsonMappingException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeAutos(String file, Collection<Auto> auto)
			throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Auto> readAutos(String file) throws JsonParseException,
			JsonMappingException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
