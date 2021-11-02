package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Delete {
   public static void main(String[] args) {
      try {
         // Load the driver dynamically
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Loaded driver.");
         String connectionString = "jdbc:mysql://localhost:3306/sakila";
         String userName = "root";
         String password = "mysql";
         Connection mysqlConnection =  DriverManager.getConnection(connectionString, userName, password);
         System.out.println("connected");
         Statement deleteStatement = mysqlConnection.createStatement();
         System.out.println("statement created");
         String deleteQuery = "delete from country where country_id = 114";
         System.out.println("delete executed");
         int rowsUpdated =  deleteStatement.executeUpdate(deleteQuery);
         if(rowsUpdated > 0){
            System.out.println("SUCCESSFULL delete");
         }
         else
         {
            System.out.println("Failed deletion");
         }
         // checked exception
      } catch (ClassNotFoundException e) {
         System.out.println("Load driver failed : " + e);
      } catch (SQLException e) {
         System.out.println("Connection Failed " + e);
      }
   }
}