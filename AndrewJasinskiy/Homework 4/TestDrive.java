package HW_4;

public class TestDrive {
    public static void main(String[] args) {

        Auto first = Auto.newBuilder()
                .setYear(2015)
                .setKpl(25)
                .setSpeed(510)
                .setPassengers(5)
                .setLoadCapacity(210)
                .setBrand("Mercedes")
                .setBrandModel("Gelandewagen G 63 AMG")
                .build();


        System.out.println(first);








    }
}
