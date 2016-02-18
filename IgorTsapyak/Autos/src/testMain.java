import EnumsForAutos.SortOrder;
import EnumsForAutos.SortValues;

import java.io.IOException;

public class testMain {

    public static void main(String[] args) throws IOException {

        Garage g1 = new Garage();
        g1.setAutos(AutoCreator.readCarsFromFile("inputAutos.txt"));
        printSortedAutos(g1, SortValues.PRICE, SortOrder.ASC);

       }

    public static void printSortedAutos(Garage g1, SortValues cat, SortOrder ord){
        switch (cat){
            case PRICE:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order*********************\n" + g1.sort(cat,ord));
                break;
            case CAR_BRAND:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order********************\n" + g1.sort(cat,ord));
                break;
            case YEAR:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order********************\n" + g1.sort(cat,ord));
                break;
            case CAR_MODEL:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order********************\n" + g1.sort(cat,ord));
                break;
            case COLOUR:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order********************\n" + g1.sort(cat,ord));

        }
    }

}
