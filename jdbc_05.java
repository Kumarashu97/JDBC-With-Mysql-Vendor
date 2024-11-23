import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_05 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sonaldb";
        String username = "root";
        String password = "Ashu5115@";

        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id ");
        int sid = scanner.nextInt();
        System.out.println("enter name ");
        String sname = scanner.next();
        System.out.println("enter age ");
        int sage = scanner.nextInt();



        //statement:
        String sqlInsertQuery = String.format("insert into myrecords(`sid`,`sname`,`sage`) values(%d,'%s',%d)",sid,sname,sage);
        Statement statement = connection.createStatement();

        int rowAffected = statement.executeUpdate(sqlInsertQuery);

        System.out.println("sucessfully inserted " + rowAffected + " " + "one rows....");



        statement.close();
        connection.close();



    }
}
