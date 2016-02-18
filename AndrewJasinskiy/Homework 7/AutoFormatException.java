package HW_7;

public class AutoFormatException extends Exception {

    AutoFormatException(ErrorsList error){
            switch (error){
            case INVALID_BRAND:
                System.out.println("Invalid format CAR BRAND. Please, try again!");
                break;
            case INVALID_BRAND_MODEL:
                System.out.println("Invalid format CAR BRAND MODEL. Please, try again!");
                break;
            case INVALID_COLOR:
                System.out.println("Invalid format COLOR. Please, try again!");
                break;
            case INVALID_PRICE:
                System.out.println("Invalid format PRICE. Please, try again!");
                break;
            case INVALID_YEAR:
                System.out.println("Invalid format YEAR. Please, try again!");
                break;
                case INVALID_FULL_INPUT_VALUE:
                    System.out.println("Incomplete input value.");
                    break;
        }
    }
    public void inputFormatException() {
        System.out.println("Invalid format input values.");
    }

}
