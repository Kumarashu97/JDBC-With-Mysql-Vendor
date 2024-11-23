import java.sql.*;

import java.sql.*;
import java.util.Stack;

import static java.lang.Class.forName;

    public class jdbc_02 {

        public static void main(String[] args) throws SQLException {
            String url = "jdbc:mysql://localhost:3306/sonaldb";
            String username = "root";
            String password = "Ashu5115@";


            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("correct....");

            //statement:
            String sqlDeleteQuery = "delete from myrecords where sid=101";
            Statement statement = connection.createStatement();

            int rowAffected = statement.executeUpdate(sqlDeleteQuery);

            System.out.println("sucessfully deleted " + rowAffected + " " + "one rows....");



            statement.close();
            connection.close();



        }

    }
