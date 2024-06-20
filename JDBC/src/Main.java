import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "postgres");
            System.out.println("Veritabanına başarıyla bağlandınız!");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees;");

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("employees_id"));
                System.out.println("Name: " + resultSet.getString("employees_name"));
                System.out.println("Position: " + resultSet.getString("position"));
                System.out.println("Salary: " + resultSet.getString("salary"));
                System.out.println("--------------------------------------");

            }
            connection.close();

        } catch (SQLException e) {
            System.err.println("Veritabanı bağlantı hatası: " + e.getMessage());
        }
    }
}