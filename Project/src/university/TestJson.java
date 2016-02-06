package university;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {

	public static void main(String... args) throws Exception {

		Auto auto = new Auto();
		auto.setColour("BLUE");
		auto.setModel("Audi");
		auto.setYear(9876);
		auto.setPrice(765);

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("d://test.json"), auto);

			String jsonInString = mapper.writeValueAsString(auto);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(auto);
			System.out.println(jsonInString);

			auto = mapper.readValue(new File("D:\\test2.json"), Auto.class);
			System.out.println(auto);

			// Convert JSON string to Object
			jsonInString = "{\"model\":\"Mesr\",\"year\":2312,\"price\":12,\"colour\":\"RED\"}";
			Auto auto1 = mapper.readValue(jsonInString, Auto.class);
			System.out.println(auto1);

			// Pretty print
			String prettyAuto1 = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(auto1);
			System.out.println(prettyAuto1);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ObjectMapper objectMapper = new ObjectMapper();

		String jsonString = "[{\"model\":\"Audi1\",\"year\":79876,\"price\":765.0,\"colour\":\"BLUE\"},"
				+ " {\"model\":\"Audi2\",\"year\":798,\"price\":765765.0,\"colour\":\"CYAN\"}]";

		List<Auto> navigation = objectMapper.readValue(
				jsonString,
				objectMapper.getTypeFactory().constructCollectionType(
						List.class, Auto.class));
 System.out.println(navigation);
 
	//mapper.writeValue(new File("d://testArr.json"), navigation);
	


try {
    TypeReference<List<Auto>> tRef = new TypeReference<List<Auto>>() {};
    navigation = mapper.readValue(new File("d:\\testArr.json"), tRef);
        System.out.println(navigation);
    

} catch (JsonGenerationException e) {
    e.printStackTrace();
} catch (JsonMappingException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}


	
auto = new Auto();
	auto.setColour("BLUyyyE");
	auto.setModel("Audi");
	auto.setYear(9876);
	auto.setPrice(765);
	
	
IOAuto myInput = new AutoService();

//myInput.writeAuto();

	
	myInput.writeAuto("CONSOLE", auto);
	
	myInput.readAutos("djfjfile"); 
	//new AutoJson().writeAuto("CONSOLE", auto);
	

	ArrayList<Auto> autos = new ArrayList<>();
	autos.add(auto);
	//Auto auto2 = new Auto();
	auto.setColour("BLUE");
	auto.setModel("Audi");
	auto.setYear(9876);
	auto.setPrice(765);
	
	
	autos.add(auto);

	try {
		auto = new AutoJson().readAuto("d://auto.json");
		new AutoJson().writeAuto("CONSOLE", auto);
		
		new AutoJson().writeAutoCollection("d://123A.txt", autos);
		//System.out.println(auto);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	}
