package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// INSERT, UPDATE, DELETE FROM TEST_NEW AND FINALLY DROP THE TABLE.
class CreateTable {
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
         Statement createTableStatement = mysqlConnection.createStatement();
         System.out.println("statement created");
         String createTable = "create table test_new (test_id int, test_name char(20))";
         // String createTable = "drop table test_new";
         System.out.println("create table  executed");
         int tableCreated =  createTableStatement.executeUpdate(createTable);
         System.out.println(tableCreated);
         if(tableCreated == 0){
            System.out.println("SUCCESSFULL creation of table");
         }
         else
         {
            System.out.println("Failed table creation");
         }
         // checked exception
      } catch (ClassNotFoundException e) {
         System.out.println("Load driver failed : " + e);
      } catch (SQLException e) {
         System.out.println("Connection Failed " + e);
      }
   }
}