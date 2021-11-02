package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Update {
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
         Statement insertStatement = mysqlConnection.createStatement();
         System.out.println("statement created");
         String updateQuery = "update country set country = 'updated country' where country_id = 114";
         System.out.println("update executed");
         int rowsUpdated =  insertStatement.executeUpdate(updateQuery);
         if(rowsUpdated > 0){
            System.out.println("SUCCESSFULL update");
         }
         else
         {
            System.out.println("Failed Updation");
         }
         // checked exception
      } catch (ClassNotFoundException e) {
         System.out.println("Load driver failed : " + e);
      } catch (SQLException e) {
         System.out.println("Connection Failed " + e);
      }
   }
}