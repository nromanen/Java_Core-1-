
public class FindASimbol {

	public static void main(String[] args) {
String x = "Putin Xlo, lalalala-lalalala";
	int k = 0;
		for (char i = 0; i < x.length(); i++ ) {
			if (x.charAt(i) == 'a')
				k++;
		}	System.out.println("кількість символів а у словосполученні " + x + " = " + k);
	}
}
