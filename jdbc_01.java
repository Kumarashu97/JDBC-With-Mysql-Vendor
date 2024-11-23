import java.sql.*;
import java.util.Stack;

import static java.lang.Class.forName;

public class   jdbc_01 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sonaldb";
        String username = "root";
        String password = "Ashu5115@";


       Connection connection =  DriverManager.getConnection(url,username,password);

        System.out.println("correct....");

        //statement:
       String sqlSelectQuery = "select sid,sname,sage from myrecords";
       Statement statement =  connection.createStatement();

       ResultSet resultSet = statement.executeQuery(sqlSelectQuery);

       //process the resultset:
        System.out.println("Result set :");
        while (resultSet.next()) {
            Integer sid = resultSet.getInt(1);
            String sname = resultSet.getString(2);
            Integer sage = resultSet.getInt(3);

            System.out.print(sid + " " + sname + " " + sage);

        }

        resultSet.close();
        statement.close();
        connection.close();










    }
}
