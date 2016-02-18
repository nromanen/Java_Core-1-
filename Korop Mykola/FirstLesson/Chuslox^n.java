import java.util.Scanner;

public class Factorial {
	private static Scanner sx;
	private static Scanner sn;

	public static void main(String[] args){
		sx = new Scanner(System.in);
		System.out.println("¬вед≥ть число X");
		int x = sx.nextInt();
		sn = new Scanner(System.in);
		System.out.println("¬вед≥ть число n");
		int n = sn.nextInt();
		long dob = x;
		for (long i = 1; i<n; i++){
			dob *=x;
			
		}
		
		System.out.println(dob);
	}

}
