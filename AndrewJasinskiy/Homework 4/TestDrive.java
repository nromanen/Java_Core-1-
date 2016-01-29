package HW_4;

import java.util.HashSet;
import java.util.Set;

public class TestDrive {
    public static void main(String[] args) {

        Auto first = Auto.newBuilder()
                .setYear(1971)
                .setFuelConsumption(35)
                .setSpeed(228)
                .setPassengers(2)
                .setLoadCapacity(130)
                .setBrand("chevrolet")
                .setBrandModel("camaro rs/ss")
                .build();

        Auto second = Auto.newBuilder()
                .setYear(1970)
                .setFuelConsumption(20)
                .setSpeed(200)
                .setPassengers(2)
                .setLoadCapacity(140)
                .setBrand("dodge")
                .setBrandModel("challenger t/a")
                .build();

        Auto third = Auto.newBuilder()
                .setYear(1965)
                .setFuelConsumption(30)
                .setSpeed(265)
                .setPassengers(2)
                .setLoadCapacity(100)
                .setBrand("shelby")
                .setBrandModel("cobra 427")
                .build();

        Auto forth = Auto.newBuilder()
                .setYear(1973)
                .setFuelConsumption(32)
                .setSpeed(190)
                .setPassengers(2)
                .setLoadCapacity(145)
                .setBrand("pontiac")
                .setBrandModel("firebird 400")
                .build();

        Set<Auto> ex = new HashSet<>();

        Exhibition exhibition = new Exhibition();

        ex.add(first);
        ex.add(second);
        ex.add(third);
        ex.add(forth);
        exhibition.setCar(ex);


        System.out.println("Sort car by year : " +"\n" +  exhibition.sort(CompareAuto.YEAR));
        System.out.println("Sort car by brand : " +"\n" +  exhibition.sort(CompareAuto.BRAND));
        System.out.println("Sort car by max speed (ascending): " +"\n" +  exhibition.sort(CompareAuto.MAX_SPEED));
        exhibition.deleteCar(CompareAuto.BRAND_MODEL, "firebird 400");
        System.out.println("Exhibition after removing car: " +"\n" + ex);

    }
}
