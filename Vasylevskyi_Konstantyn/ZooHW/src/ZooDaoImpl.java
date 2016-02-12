import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smart on 12.02.2016.
 */
public class ZooDaoImpl implements ZooDao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn = null;
    Statement stmt = null;
    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Override
    public void addAnimal(Animal animal) throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String name = animal.getName();
        int id = animal.getId();
        String sql = "insert into animals values (" + id + ", '" + name + "')";
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return null;
    }

    @Override
    public void setAnimalDeleted(Animal animal, boolean deleted) {

    }

    @Override
    public List<Animal> getAllAnimals() throws  Exception{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT id, name FROM animals";
        ResultSet rs  = stmt.executeQuery(sql);
        Animal animal;
        ArrayList<Animal> animals = new ArrayList<>();
        while (rs.next()) {
            animal = new Animal();
            animal.setId(rs.getInt("id"));
            animal.setName(rs.getString("name"));
            animals.add(animal);
        }
        stmt.close();
        conn.close();
        return animals;
    }

    @Override
    public List<Animal> getAllDeletedAnimals() {
        return null;
    }

    @Override
    public List <Animal> getAnimalByID(int id) throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT  id, name FROM animals WHERE id="+id+"";
        ResultSet rs  = stmt.executeQuery(sql);
        List<Animal> animals = new ArrayList<>();
        Animal animal;
        while (rs.next()) {
            animal = new Animal();
            animal.setId(rs.getInt("id"));
            animal.setName(rs.getString("name"));
            animals.add(animal);
        }
        stmt.close();
        conn.close();
        return animals;
    }

    @Override
    public List<Animal> getAnimalLikeName(String name) throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT  id,name FROM animals WHERE name LIKE '%"+name+"%'";
        ResultSet rs  = stmt.executeQuery(sql);
        List<Animal> animals = new ArrayList<>();
        Animal animal;
        while(rs.next()){
            animal = new Animal();
            animal.setId(rs.getInt("id"));
            animal.setName(rs.getString("name"));
            animals.add(animal);
        }
        stmt.close();
        conn.close();
        return animals;
    }

    @Override
    public void createTable() throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet rs = meta.getTables(null, null, "ANIMALS",
                null);
        if (!rs.next()) {
            System.out.println("Table doesn't exist,creating table...");
            sql = "CREATE TABLE ANIMALS" +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255))";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        }

    }

    @Override
    public void getAnimals() throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT id, name FROM animals";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int id  = rs.getInt("id");
            String first = rs.getString("name");
            System.out.print("ID: " + id);
            System.out.println(", Name: " + first);
        }
        stmt.close();
        conn.close();
    }
}
