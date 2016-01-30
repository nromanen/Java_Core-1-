package university;

import static university.Utils.isValidString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoBuilder {

	/*public static Auto valueOf(String autoRepresentation){
		Auto auto = new Auto();
		String[] string = autoRepresentation.split(",\\s");
		auto.setModel(string[0]);
		auto.setYear(Integer.parseInt(string[1]));
		return auto;
	}*/
	
	public static Auto valueOf(String autoRepresentation){
		Auto auto = new Auto();
		
		String Input_Pattern_Full_Match = "(.*),\\s(.*)";

		Pattern p2 = Pattern.compile(Input_Pattern_Full_Match);
		Matcher m2 = p2.matcher(autoRepresentation);

		m2.matches();

				
	//	String s = AutoValidator.errors(autoRepresentation)[0];
		
	//	System.out.println(autoRepresentation + " ***" +s);
			if (!(AutoValidator.errors(autoRepresentation)[0]).isEmpty()){
				return null;
			}
			else 
				auto.setModel(m2.group(1));
		
	if (!(AutoValidator.errors(autoRepresentation)[1]).isEmpty()){
		return null;
	}
		else {
			auto.setYear(Integer.parseInt(m2.group(2)));
		}
	
			auto.setColour("Blue");
		auto.setPrice(34.5);
		return auto;
	}
	
	
	public static void main(String ...strings ){
		Auto a = AutoBuilder.valueOf("yMuyu, 987");
		/*a.setColour("Red");
		a.setPrice(456);*/
		System.out.println(a);
/*		
		Pattern pattern = Pattern.compile("([a-z]+)([0-9])");
		Matcher matcher = pattern.matcher("67yt23");
		matcher.find();

		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
*/
		Scanner scn = new Scanner(System.in);
		a = AutoBuilder.valueOf(scn.nextLine());
		String model = "RTY";
		 if (Utils.isValidString(model, "MODEL_PATTERN")){
			 a.setModel(model);
		 }
		
		//String[] string = AutoValidator.errors("Mui, 987");
		//System.out.println(Arrays.toString(string));
		
	}
}



//Exception for invalidFormat 