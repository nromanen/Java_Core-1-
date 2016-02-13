import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Smart on 13.02.2016.
 */
public class ZooDao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/animals";
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
    public void createTable() throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
        DatabaseMetaData meta = conn.getMetaData();
        ResultSet rs = meta.getTables(null, null, "animals_table",
                null);
        if (!rs.next()) {
            System.out.println("Table doesn't exist,creating table...");
            sql = "CREATE TABLE ANIMALS_TABLE" +
                    "(id  INT NOT NULL PRIMARY KEY AUTO_INCREMENT," +
                    "type VARCHAR(255)," +
                    " family VARCHAR(255)," +
                    " name VARCHAR (255),"+
                    " meet BOOLEAN DEFAULT NULL )";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        }
}
    public List <Animal> getValidAnimals() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT type,family,name,meet FROM animals_table";
        ResultSet rs  = stmt.executeQuery(sql);
        List<Animal> animals = new ArrayList<>();
        Animal animal;
        while (rs.next()){
            animal = new Animal();
            animal.setFamily(rs.getString("family"));
            animal.setName(rs.getString("name"));
            animals.add(animal);
        }
        stmt.close();
        conn.close();
        return animals;
    }
    public Animal getAnimalByID(int id) throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql = "SELECT  id, type, family ,name, meet FROM animals_table WHERE id="+id+"";
        ResultSet rs  = stmt.executeQuery(sql);
        Animal animal = new Animal();
        while (rs.next()) {
            animal.setName(rs.getString("name"));
            animal.setFamily(rs.getString("family"));
            animal.setMeet(rs.getBoolean("meet"));
        }
        stmt.close();
        conn.close();
        return animal;
    }
    public void deleteDefaultAnimal() throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
        sql ="DELETE FROM animals_table WHERE name='NONE' ";
        stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        }
    public boolean isExist(String name,String family) throws SQLException {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
               sql ="SELECT * FROM animals_table WHERE name ='"+name+"' AND family= '"+family+"' ";
        ResultSet rs  = stmt.executeQuery(sql);
        if (rs.next()){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return  false;
        }
    }
    public void addAnimals(Animal animal) throws Exception {
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String sql;
        String type =animal.getType().toString();
        String family=animal.getFamily();
        String name=animal.getName();
         Boolean meet = animal.isMeet();
        sql ="insert into animals_table (type, family, name, meet)  values ('" + type + "', '" + family + "', '" + name + "',"+ meet+")";
        if (isExist(name,family)){
            System.out.println("Animal exist!");
        }
        else{
            stmt.executeUpdate(sql);
            stmt.close();
        }
            conn.close();
    }
}
