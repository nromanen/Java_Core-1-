package university;

import static university.Utils.isValidString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;



public class AutoBuilder {

	public static Auto valueOf(String autoRepresentation) {
		Auto auto = new Auto();

/*		String[] array = Arrays.asList(autoRepresentation.split("[,]"))
				.stream().filter(str -> !str.isEmpty())
				.collect(Collectors.toList()).toArray(new String[0]);
*/
		
		String[] strings = StringUtils.split(autoRepresentation, ", .;[]()");

		if (!(AutoValidator.errors(autoRepresentation)[0]).isEmpty()) {
			return null;
		} else
			auto.setModel(strings[0]);

		if (!(AutoValidator.errors(autoRepresentation)[1]).isEmpty()) {
			return null;
		} else {
			auto.setYear(Integer.parseInt(strings[1]));
		}

		auto.setColour("Blue");
		auto.setPrice(34.5);
		return auto;
	}

	public static Auto buildFromString(String autoRepresentation)
			throws AutoFormatException {
		for (String s : AutoValidator.errors(autoRepresentation)) {
			if (!s.isEmpty()) {
				throw new AutoFormatException(
						AutoValidator.errors(autoRepresentation));
			}
		}
		return AutoBuilder.valueOf(autoRepresentation);
	}

	public static void main(String... strings) {
		try {
			System.out.println(buildFromString("Tiui, 1223"));
			//System.out.println(buildFromString("Tiui, 12"));
			System.out.println(buildFromString("Tiui [1256"));
		} catch (AutoFormatException autoFormat) {
			System.out.println(autoFormat);
		}

		Auto a = AutoBuilder.valueOf("M3uyu, 987");
		/*
		 * a.setColour("Red"); a.setPrice(456);
		 */
		System.out.println(a);
		/*
		 * Pattern pattern = Pattern.compile("([a-z]+)([0-9])"); Matcher matcher
		 * = pattern.matcher("67yt23"); matcher.find();
		 * 
		 * System.out.println(matcher.group(1));
		 * System.out.println(matcher.group(2));
		 */
		Scanner scn = new Scanner(System.in);
		a = AutoBuilder.valueOf(scn.nextLine());
		String model = "RTY";
		if (Utils.isValidString(model, "MODEL_PATTERN")) {
			a.setModel(model);
		}

		// String[] string = AutoValidator.errors("Mui, 987");
		// System.out.println(Arrays.toString(string));

	}
}

// Exception for invalidFormat 