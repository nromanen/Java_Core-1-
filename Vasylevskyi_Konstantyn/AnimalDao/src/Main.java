import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smart on 13.02.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Animal animal = new Animal();
        animal.setType(Animal.AnimalType.BIRDS);
        animal.setFamily("Tiger4");
        animal.setName("Vasya2");
        animal.setMeet(false);
        try {
            new ZooDao().createTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new ZooDao().getValidAnimals());

        try {
            new ZooDao().addAnimals(ZooService.stringToAnimal(ZooService.animalValidator("Type:2,Family:voro9n,Name:V7sya,Meet:true")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*try {
            new ZooDao().deleteDefaultAnimal();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println(new ZooDao().getAnimalByID(2).getFamily());


    }

}
