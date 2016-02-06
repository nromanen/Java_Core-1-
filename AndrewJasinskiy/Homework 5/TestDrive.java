package HW_5;

import java.util.HashSet;
import java.util.Set;

import static HW_4.Exhibition.INC;

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
                .setPrice(67.454)
                .build();

        Auto second = Auto.newBuilder()
                .setYear(1970)
                .setFuelConsumption(20)
                .setSpeed(200)
                .setPassengers(2)
                .setLoadCapacity(140)
                .setBrand("dodge")
                .setBrandModel("challenger t/a")
                .setPrice(96.935)
                .build();

        Auto third = Auto.newBuilder()
                .setYear(1965)
                .setFuelConsumption(30)
                .setSpeed(265)
                .setPassengers(2)
                .setLoadCapacity(100)
                .setBrand("shelby")
                .setBrandModel("cobra 427")
                .setPrice(94.635)
                .build();

        Auto forth = Auto.newBuilder()
                .setYear(1973)
                .setFuelConsumption(32)
                .setSpeed(190)
                .setPassengers(2)
                .setLoadCapacity(145)
                .setBrand("pontiac")
                .setBrandModel("firebird 400")
                .setPrice(104.545)
                .build();

        Set<Auto> ex = new HashSet<>();

        Exhibition exhibition = new Exhibition();

        ex.add(first);
        ex.add(second);
        ex.add(third);
        ex.add(forth);
        exhibition.setCar(ex);


        System.out.println("Sort car by price : " +"\n" +  exhibition.sort(AutoSelection.PRICE, INC));
       /* System.out.println("Sort car by year : " +"\n" +  exhibition.sort(AutoSelection.YEAR));
        System.out.println("Sort car by year INC : " +"\n" +  exhibition.sort(AutoSelection.YEAR,INC));
        System.out.println("Get car by Year : " +"\n" +  exhibition.getByYear(1973));
        System.out.println("Get car by Brand : " +"\n" +  exhibition.getByBrand("shelby"));
        */
        //System.out.println("Sort car by year INC : " +"\n" +  exhibition.sort(AutoSelection.YEAR,INC));
        //System.out.println("Sort car by brand : " +"\n" +  exhibition.sort(CompareAuto.BRAND));
        //System.out.println("Sort car by max speed: " +"\n" +  exhibition.sort(CompareAuto.MAX_SPEED));
        //exhibition.deleteCar(AutoSelection.YEAR, 1965);
        //System.out.println("Exhibition after removing car: " +"\n" + ex);

    }
}
