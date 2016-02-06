package university;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AutoJson implements IOAuto {
	
	
/*	public static void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(file), auto);
		
	}
*/	
	
	public static void writeAuto2(String file, Auto auto) throws IOException{
	
		FileWriter fw = new FileWriter("d://12.txt");
		fw.write(auto.toString());
		System.out.println("done");
		fw.close();
	}
	



	/**
	 * output auto on console, if arg file = "CONSOLE"
	 */
	@Override
	public void writeAuto(String file, Auto auto) throws JsonGenerationException, JsonMappingException, IOException {
		if ("CONSOLE".equals(file)){
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(System.out, auto);	
		}
		else{
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(file), auto);
		}
	}

	
	

	@Override
	public Auto readAuto(String file) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(file), Auto.class);
			}





public void writeAutoCollection(String File, Collection<Auto> autos){
	ObjectMapper mapper = new ObjectMapper();
	try {
		
		mapper.writeValue(new File("d://testArr2.json"), autos);
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
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
}}
