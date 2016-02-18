import java.sql.SQLException;
import java.util.List;

/**
 * Created by Smart on 12.02.2016.
 */
public class ZooServiceImpl implements ZooService{

    @Override
    public void addAnimal(Animal animal) throws Exception {
        new ZooDaoImpl().addAnimal(animal);
    }

    @Override
    public Animal updateAnimal(Animal animal) throws Exception {
        return null;
    }

    @Override
    public void setAnimalDeleted(Animal animal, boolean deleted) throws Exception {

    }

    @Override
    public List<Animal> getAllAnimals() throws Exception {
        return  new ZooDaoImpl().getAllAnimals();
    }

    @Override
    public List<Animal> getAllDeletedAnimals() throws Exception {
        return null;
    }

    @Override
    public List<Animal> getAnimalByID(int id) throws Exception {
        return new ZooDaoImpl().getAnimalByID(id);
    }

    @Override
    public List<Animal> getAnimalLikeName(String name) throws Exception {
        return new ZooDaoImpl().getAnimalLikeName(name);
    }


    @Override
    public void getAnimals() throws Exception {
           new ZooDaoImpl().getAnimals();
    }
}
