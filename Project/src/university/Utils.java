package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static List<String> splitInList(String string, String regexp) {
		List<String> words =  new ArrayList<>(
				Arrays.asList(string.split(regexp)));
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().isEmpty()) {
				iterator.remove();
			}
		}
		return words;

	}

	public static boolean isAnalogue(String template, String tested) {
		String regexp = "[\\.;,\\s]";
		int numberOfMatch = 3;
		List<String> templateList = splitInList(template, regexp);
		List<String> testedList = splitInList(tested, regexp);
		if (templateList.size() != testedList.size())
			return false;
		for (int i = 0; i < testedList.size(); i++) {
			if (!(templateList.get(i).substring(0, numberOfMatch)
					.equalsIgnoreCase(testedList.get(i).substring(0, numberOfMatch)))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isValidString(String string, String regexp){
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(string);
		return m.matches();
	}

}


//Builder with two arguments

//Enum for Auto for Compare

//Matcher Pattern

//"Audi,754 year (765.98), color=kdkdk"