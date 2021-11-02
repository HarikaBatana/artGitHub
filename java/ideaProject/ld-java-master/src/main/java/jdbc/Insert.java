package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Insert {
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
         String insertQuery = "insert into country (country) values ('newcountry')";
         System.out.println("insert executed");
         int rowsInserted =  insertStatement.executeUpdate(insertQuery);
         if(rowsInserted == 1){
            System.out.println("SUCCESSFULL INSERTED");
         }
         else
         {
            System.out.println("Failed Insertion");
         }
         // checked exception
      } catch (ClassNotFoundException e) {
         System.out.println("Load driver failed : " + e);
      } catch (SQLException e) {
         System.out.println("Connection Failed " + e);
      }
   }
}