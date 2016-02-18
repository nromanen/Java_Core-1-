import java.util.*;

public class NDob {
	private static Scanner sc;

	public static void main (String[] args) {
		sc = new Scanner (System.in);
		System.out.println ("¬вед≥ть N значне число");
		int dob = 1;
		int k;
		
	for (int p = sc.nextInt(); p > 0 ; p /=10){
		k = p % 10;
	    dob = dob*k;
	}
	System.out.println(dob);
  }
	
}
