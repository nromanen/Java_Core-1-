import java.util.Scanner;

public class Zamina {
	private static Scanner sc;

	public static void main (String[] args){
		
		sc = new Scanner (System.in);
		System.out.println("¬вед≥ть N значне число");
		int z = 9;
		int k;
		String st = new String();
		
		for (int p = sc.nextInt(); p > 0; p /= 10){
			k = p % 10;
		if ( k > 0 | k < 0 ){ 
			st +=k;
		}
		else {
			st +=z;
		}
	    }
		String reverse = new StringBuffer (st).reverse().toString();
		System.out.println (reverse);
	}

}