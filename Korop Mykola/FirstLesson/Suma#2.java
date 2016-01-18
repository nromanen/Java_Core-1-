import java.util.*;

public class Sum {

	private static Scanner sc;

	public static void main (String[] args) {
		sc = new Scanner (System.in);
		System.out.println ("¬вед≥ть N значне число");
		int parsum = 0;
		int neparsum = 0;
		int k;
		int i = 2;
		
	for (int p = sc.nextInt(); p > 0 ; p /=10){
		k = p % 10;
	  if (k%i > 0){
		 neparsum +=k;		  
	  }
	  else
	  {
		  parsum +=k;
	  }
	}
	System.out.println("—ума парних чисел" + " " + parsum);
	System.out.println("—ума непарних чисел" + " " + neparsum);
  }
	
}
