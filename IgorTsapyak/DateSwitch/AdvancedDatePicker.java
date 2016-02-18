/**
 * Detailed commentary stored in a folder Dathe switch.
 * For use the program - type your date to INPUT_DATE var in format dd.mm.yyyy
 */
public class AdvancedDatePicker {

        public static final String INPUT_DATE = "19.12.2016";
        public static final String DAY = "Day";
        public static final String MONTH = "Month";
        public static final String YEAR = "Year";
        public static final int VALID_INT_COUNT = 10;
        public static final int MONTH_MAX_COUNT = 12;
        public static final int FEBRUARY = 2;
        public static final int MAX_FEBRUARY_LONG_YEAR_COUNT = 29;
        public static final int MAX_FEBRUARY_SHORT_YEAR_COUNT = 28;
        public static final int FEBRUARY_MONTH = 3;
        public static final int THIRTY_ONE_DAY_MONTH = 1;
        public static final int THIRTY_ONE_DAY_MONTH_LAST_DAY = 31;
        public static final int THIRTY_DAY_MONTH = 2;
        public static final int THIRTY_DAY_MONTH_LAST_DAY = 30;
        public static final int FIRST_DAY_INDEX_OF_INPUT_DATE = 0;
        public static final int LAST_DAY_INDEX_OF_INPUT_DATE = 2;
        public static final int FIRST_MONTH_INDEX_OF_INPUT_DATE = 3;
        public static final int LAST_MONTH_INDEX_OF_INPUT_DATE = 5;
        public static final int FIRST_YEAR_INDEX_OF_INPUT_DATE = 6;
        public static final int LAST_YEAR_INDEX_OF_INPUT_DATE = 10;
        public static final int NEXT_VAL_OF_DATE = 1;
        public static final int FIRST_DAY_OF_MONTH = 1;
        public static final int FIRST_MONTH_OF_THE_YEAR = 1;
        public static final int VAL_FOR_LONG_YEAR_CHECK = 4;
        public static final int VAR_FOR_DOT_ADD = 10;




    public static void main(String[] args) {
        if (!validator()){
           resultMethod(dateToString(dayIncrement(dateSeparete(DAY))),
                        dateToString(monthIncrement(dateSeparete(MONTH))),
                        dateToString(yearIncrement(dateSeparete(YEAR))));
        }

    }
    public static void resultMethod(String day, String month, String year){
        System.out.println(day+month+year);
    }

    public static boolean validator(){
        if (dateValidation(dateSeparete(DAY),dateSeparete(MONTH))){
            System.out.println("Input date is incorrect, please input correct date!");
            return true;
        }return false;
    }

    public static boolean dateValidation(int day, int month){
        if (INPUT_DATE.length()<VALID_INT_COUNT){
            return true;
        }else if (month > MONTH_MAX_COUNT){
            return true;
        }else if (!yearHelper(dateSeparete(YEAR))&& month == FEBRUARY && day > MAX_FEBRUARY_SHORT_YEAR_COUNT){
            return true;
        }else if (yearHelper(dateSeparete(YEAR))&& month == FEBRUARY && day > MAX_FEBRUARY_LONG_YEAR_COUNT){
            return true;
        }else if (monthHelper(month)==THIRTY_ONE_DAY_MONTH&&day>THIRTY_ONE_DAY_MONTH_LAST_DAY){
            return true;
        }else if (monthHelper(month)==THIRTY_DAY_MONTH&&day>THIRTY_DAY_MONTH_LAST_DAY){
            return true;
        }
        return false;
    }

    public static int dateSeparete(String helpNum) {
        int separatedNums = 0;
        switch (helpNum) {
            case "Day":
                separatedNums = Integer.valueOf(INPUT_DATE.substring(FIRST_DAY_INDEX_OF_INPUT_DATE,LAST_DAY_INDEX_OF_INPUT_DATE ));
                break;
            case "Month":
                separatedNums = Integer.valueOf(INPUT_DATE.substring(FIRST_MONTH_INDEX_OF_INPUT_DATE, LAST_MONTH_INDEX_OF_INPUT_DATE));
                break;
            case "Year":
                separatedNums = Integer.valueOf(INPUT_DATE.substring(FIRST_YEAR_INDEX_OF_INPUT_DATE, LAST_YEAR_INDEX_OF_INPUT_DATE));
                break;
            default:
                System.out.println("Information is invalid");
        }
        return separatedNums;

    }

    public static int yearIncrement(int yearNum) {
       if (dateSeparete(DAY) == THIRTY_ONE_DAY_MONTH_LAST_DAY&&dateSeparete(MONTH)==MONTH_MAX_COUNT){
           yearNum +=NEXT_VAL_OF_DATE;
           return yearNum;
       }
        return yearNum;
    }

    public static int dayIncrement(int dayNum) {
        if (dayHelper()==0){
            dayNum +=NEXT_VAL_OF_DATE;
            return dayNum;
        }
        dayNum = FIRST_DAY_OF_MONTH;
        return dayNum;
    }

    public static int monthIncrement(int monthNum) {
        if (yearEndChecker(dateSeparete(MONTH))){
            return FIRST_MONTH_OF_THE_YEAR;
        }
        if (dayHelper()==1){
            monthNum +=NEXT_VAL_OF_DATE;
            return monthNum;
        }
      return monthNum;
        }

    public static boolean yearHelper(int year){
        if (year % VAL_FOR_LONG_YEAR_CHECK == 0){
            return true;

        }
        return false;
    }

    public static boolean yearEndChecker(int month){
        if (month==MONTH_MAX_COUNT&&dateSeparete(DAY)==THIRTY_ONE_DAY_MONTH_LAST_DAY){
            return true;
        }return false;
    }

    public static int monthHelper(int month){
        int result = 0;
        int monthesPlus1[] = new int[]{1,3,5,7,8,10,12};
        int monthes[] = new int[]{4,6,9,11};
            for (int i = 0; i < monthesPlus1.length; i++){
                if (monthesPlus1[i] == month)
                    result = THIRTY_ONE_DAY_MONTH;
        }
        for (int i = 0; i < monthes.length; i++){
            if (monthes[i] == month)
                result = THIRTY_DAY_MONTH;

        }
            if (month == 2)
                result = FEBRUARY_MONTH;


        return result;
    }

    public static int dayHelper(){
        if (yearHelper(dateSeparete(YEAR))&&monthHelper(dateSeparete(MONTH))==FEBRUARY_MONTH&&dateSeparete(DAY)==MAX_FEBRUARY_LONG_YEAR_COUNT) {
            return 1;
        }else if (monthHelper(dateSeparete(MONTH))==FEBRUARY_MONTH&&dateSeparete(DAY)==MAX_FEBRUARY_SHORT_YEAR_COUNT&&!yearHelper(dateSeparete(YEAR))) {
            return 1;
        } else if (monthHelper(dateSeparete(MONTH))==THIRTY_DAY_MONTH&&dateSeparete(DAY)==THIRTY_DAY_MONTH_LAST_DAY){
            return 1;
        }else if (monthHelper(dateSeparete(MONTH))==THIRTY_ONE_DAY_MONTH&&dateSeparete(DAY)==THIRTY_ONE_DAY_MONTH_LAST_DAY) {
            return 1;
        }return 0;
    }

    public static String dateToString(int peaceOfDate){
        String outDate;
        if (yearChecker(peaceOfDate)){
            outDate = String.valueOf(peaceOfDate);
            return outDate;
        }else {
            outDate = String.valueOf(peaceOfDate) + '.';
            if (peaceOfDate < VAR_FOR_DOT_ADD) {
                outDate = '0' + outDate;
            }
            return outDate;
        }
    }


    public static boolean yearChecker(int date){
        if (date > THIRTY_ONE_DAY_MONTH_LAST_DAY){
            return true;
        } return false;
    }

}
