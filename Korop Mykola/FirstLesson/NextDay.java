import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextDayCal {
   private Scanner sd;
   private Scanner sm;
   private Scanner sy;
public static void main(String[] args) {
       NextDayCal cal = new NextDayCal();
       cal.CalendarArith();
   }
   private void CalendarArith() {
	  sd = new Scanner (System.in);
	  System.out.println("¬вед≥ть день");
	  int d = sd.nextInt();
	  sm = new Scanner (System.in);
	  System.out.println("¬вед≥ть м≥с€ць");
	  int m = sm.nextInt();
	  sy = new Scanner (System.in);
	  System.out.println("¬вед≥ть р≥к");
	  int y = sy.nextInt();
      Calendar cal = new GregorianCalendar(y, m, d);
      cal.add(Calendar.MONTH, -1);
      cal.add(Calendar.DAY_OF_MONTH, 1);
      SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
      String date = sdf.format(cal.getTime());
      System.out.println(date);

   }
}