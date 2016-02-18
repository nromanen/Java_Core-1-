import java.util.Scanner;

public class Factorial {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("¬вед≥ть фактор≥ал числа");
		int n = sc.nextInt();
		long dob = 1;
		for (long i = 1; i<n+1; i++){
			dob *=i;
			
		}
		
		System.out.println(dob);
	}

}