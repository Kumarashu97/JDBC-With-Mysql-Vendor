import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_04 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sonaldb";
        String username = "root";
        String password = "Ashu5115@";


        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("correct....");

        //statement:
        String sqlUpdateQuery = "update myrecords set sage = '20' where sid='101' ";
        Statement statement = connection.createStatement();

        int rowAffected = statement.executeUpdate(sqlUpdateQuery);

        System.out.println("sucessfully updated " + rowAffected + " " + "one rows....");



        statement.close();
        connection.close();



    }
}
