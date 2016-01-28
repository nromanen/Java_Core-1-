import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class testMain {

    public static void main(String[] args) {
        Auto a1 = new AutoBuilder()
                .setCarBrand("Audi")
                .setModel("A6")
                .setColour("Black")
                .setYear(2010)
                .setPrice(25000)
                .build();

        Auto a2 = new AutoBuilder()
                .setCarBrand("Mercedes")
                .setModel("E300")
                .setColour("White")
                .setYear(2011)
                .setPrice(24000)
                .build();

        Auto a3 = new AutoBuilder()
                .setCarBrand("BMW")
                .setModel("M5")
                .setColour("Red")
                .setYear(2009)
                .setPrice(15000)
                .build();

        Set<Auto> garage = new HashSet<>();
        garage.add(a1);
        garage.add(a2);
        garage.add(a3);

        Garage g1 = new Garage();
        
        g1.setAutos(garage);
        printSortedAutos(g1,CompareCategories.YEAR,TheOrderOfSort.DECREASE);
        printSortedAutos(g1,CompareCategories.YEAR,TheOrderOfSort.GROWTH);
    }

    public static void printSortedAutos(Garage g1, CompareCategories cat, TheOrderOfSort ord){
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
            case MODEL:
                System.out.println("********************AutosSortedBy"+cat+"in"
                        + ord + "order********************\n" + g1.sort(cat,ord));
        }
    }

}
