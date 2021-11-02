package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Select {
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
         Statement selectStatement = mysqlConnection.createStatement();
         System.out.println("statement created");
         System.out.println("statement executed and result obtained");
         // String selectQuery = "select country_id, country from country where country_id < 6";
         String selectQuery = "select country_id, country from country";
         ResultSet countriesResultSet =  selectStatement.executeQuery(selectQuery);
         // System.out.println("Moving to first record");
         // countriesResultSet.next();
         // int countryId = countriesResultSet.getInt("country_id");
         // String country = countriesResultSet.getString("country");
         // System.out.println(countryId + " >>> " + country);
         while(countriesResultSet.next()){
             int countryId = countriesResultSet.getInt("country_id");
         String country = countriesResultSet.getString("country");
         System.out.println(countryId + " >>> " + country);
         }
         // checked exception
      } catch (ClassNotFoundException e) {
         System.out.println("Load driver failed : " + e);
      } catch (SQLException e) {
         System.out.println("Connection Failed " + e);
      }
   }
}