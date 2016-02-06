package university;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static university.Utils.isValidString;

public class AutoValidator {

	public static String[] errors(String autoRepresentation) {
		String[] result = new String[4];

		String Model_Pattern = "[A-Z]{1}[a-z]{1,}";
		String Year_Pattern = "(19[3-9]\\d|20[0-1][0-6])";
		String Price_Pattern = "[0-9]{1,}[,.][0-9]{1,}";
		String Color_Pattern = "[A-Z][a-z]{1,}";
		String Input_Pattern_Full_Match = "(.*),\\s(.*),\\s(.*),\\s(.*)";

		Pattern p2 = Pattern.compile(Input_Pattern_Full_Match);
		Matcher m2 = p2.matcher(autoRepresentation);

		if (m2.matches()) {
			if (isValidString(m2.group(1), Model_Pattern)) {
				result[0] = "";
			} else {
				result[0] = "Wrong Car title";
			}

			if (isValidString(m2.group(2), Year_Pattern)) {
				result[1] = "";
			} else {
				result[1] = "Wrong Year format";
			}
			if (isValidString(m2.group(3), Price_Pattern)) {
				result[2] = "";
			} else {
				result[2] = "Wrong Price format";
			}
			if (isValidString(m2.group(4), Color_Pattern)) {
				result[3] = "";
			} else {
				result[3] = "Wrong Color format";
			}


		}
		else result=null;

		return result;//new String[]{"result", "12"};

	}

}