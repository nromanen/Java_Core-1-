
public class Nfact {

	public static void main(String[] args) {
		 int n;
		 n = 5;
	        do {
	               int result = 1;
	                for (int i = 2; i <= n; i++)
	                  result *= i;
	                  System.out.println("Фвкторіал" + n + "=" + result);
	                if (n == 0 || n == 1)
	                 System.out.println(result);
	             if(n < 0)
	             System.out.println("Вы ввели отрицательный факториал!");
	        } while (n < 0);

	}

}
