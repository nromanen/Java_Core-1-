import java.util.List;

/**
 * Created by Smart on 12.02.2016.
 */
public interface ZooDao {
    public void addAnimal(Animal animal)throws Exception;
    public Animal updateAnimal(Animal animal)throws Exception;
    public void setAnimalDeleted(Animal animal,boolean deleted)throws Exception;
    public List<Animal> getAllAnimals()throws Exception;
    public List<Animal> getAllDeletedAnimals()throws Exception;
    public List<Animal> getAnimalByID(int id)  throws Exception;
    public List<Animal> getAnimalLikeName(String name)  throws Exception;
    public void createTable()  throws Exception;
    public void getAnimals()  throws Exception;
}
