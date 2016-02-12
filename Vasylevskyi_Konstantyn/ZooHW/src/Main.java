/**
 * Created by Smart on 12.02.2016.
 */


public class Main {
    public static void main(String[] args) throws Exception {

           Animal animal = new Animal ();
           animal.setName("kengoo");
           animal.setId(1);
        //Creating table if not exists
        new ZooDaoImpl().createTable();
        System.out.println("<-----Add animal------------------>");
        new ZooDaoImpl().addAnimal(animal);
        System.out.println("<-----Get all animals fromDB------>");
        new ZooServiceImpl().getAnimals();
        System.out.println("<-----Get all animals------------->");
        System.out.println(new ZooServiceImpl().getAllAnimals());
        System.out.println("<-----Get Animal By ID------------>");
        System.out.println(new ZooServiceImpl().getAnimalByID(1));
        System.out.println("<-----Get Animal by name part----->");
        System.out.println(new ZooServiceImpl().getAnimalLikeName("ken"));


    }
}
