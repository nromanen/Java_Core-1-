package zoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Animal;

public class ZooService {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	Connection conn = null;
	Statement stmt = null;

	public void addAnimal(Animal animal) throws Exception {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		String sql;
		// int id = 2;
		String name = animal.getName();
		sql = "insert into animals (name) values ('" + name + "')";

		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();

	}

	public void delAnimalById(int id) throws Exception {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		// String sql = "delete from animals where id = " + id;
		String sql = "delete from animals where name = \"\"";
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();

	}

	public void addAnimal2(Animal animal) throws Exception {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		String sql;
		sql = "insert into animals (name) values (?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, animal.getName());
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();

	}

	public Animal getLikeName(String name) {

		return new Animal();
	}

	public List<Animal> getAll() throws Exception {
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
		String sql = "SELECT id, name FROM animals";
		ResultSet rs = null;
		rs = stmt.executeQuery(sql);
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
}