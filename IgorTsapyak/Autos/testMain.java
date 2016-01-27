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
        System.out.println(garage);

        System.out.println("_________\n" + g1.sort(CompareCategories.YEAR));


    }



}
