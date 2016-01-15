
public class Date {

	public static void main(String[] args) {
	int year;
	int month;
	int day;
	year = 29;
	month = 12;
	day = 31;
	// ввели зм≥нн≥, дал≥ дл€ м≥с€ц≥в з 31 днем у кожному
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
			if (!(day < 1) && !(day > 30)) {
				day++;
	System.out.println(day + "." + month + "." + year);
	}
}		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
			if (day == 31) {
				day = 1;
				month++;
	System.out.println(day + "." + month + "." + year);
	}
	// дал≥ дл€ м≥с€ц≥в з 30 дн€ми у кожному
} 		else if (month == 4 || month == 6 || month == 9 || month == 11 ) { 
			if (!(day < 1) && !(day > 30)) {
				day++;
	System.out.println(day + "." + month + "." + year);
	}
	//к≥нець року
}		else if (month == 12) {
			if (!(1 > day) && day <= 30) {
				day++;
	System.out.println(day + "." + month + "." + year);
	}
}		if (day == 31 && !(day < 31)) {
			month = 1;
				day = 1;
				year++;
	System.out.println(day + "." + month + "." + year + "  !!!« новим роком!!!");
		}					
	}
}


