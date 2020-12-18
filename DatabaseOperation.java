package softwareproject2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class DatabaseOperation {
    
    
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;
    Scanner sc = null;
    
     void readData( ){
        try {
            
            sc = new Scanner(System.in);
            connect = DatabaseLink.getInstance( );
                    /*statement=connect.createStatement();
                    result=statement.executeQuery("SELECT * From sp_final.employee");
                    
                    while (result.next()) {
                System.out.println("Usernmae: " + result.getString("Username"));
                System.out.println("Password: " + result.getString("Password"));
                System.out.println("Area: " + result.getString("Area"));
                }*/
                
                    preparedStatement = connect.prepareStatement("SELECT Name,Mobile,Age FROM employee_info WHERE id = ?;");   
                    preparedStatement.setString(1, sc.nextLine());
                    result = preparedStatement.executeQuery();
                    
                     while (result.next()) {
                    System.out.println("Name: " + result.getString("Name"));
                    System.out.println("Mobile: " + result.getString("Mobile"));
                    System.out.println("Age: " + result.getString("Age"));
                     }
                    
                    /*preparedStatement = connect.prepareStatement("UPDATE employee_info set age=? WHERE id = ?;");
                    System.out.println("Please input age");
                    preparedStatement.setString(1, sc.nextLine());
                    System.out.println("Please input id");
                    preparedStatement.setString(2, sc.nextLine());
                    preparedStatement.execute( );
                    statement=connect.createStatement();
                    result=statement.executeQuery("SELECT * From employee_info");
                    
                    
                    while (result.next()) {
                    System.out.println("Name: " + result.getString("Name"));
                    System.out.println("Mobile: " + result.getString("Mobile"));
                    System.out.println("Age: " + result.getString("Age"));
                     }*/
                    
                    /*preparedStatement = connect.prepareStatement("INSERT into employee_info(id,Name,Mobile,Age,Gender)"+"VALUES (6,'Peu Rahman Bhuiyan',01541254155,19,'Female')");
                    preparedStatement.execute( );
                    statement=connect.createStatement();
                    result=statement.executeQuery("SELECT * From employee_info");
                    
                    while (result.next()) {
                    System.out.println("Name: " + result.getString("Name"));
                    System.out.println("Mobile: " + result.getString("Mobile"));
                    System.out.println("Age: " + result.getString("Age"));
                    
                    */

                    
                      
                    /*preparedStatement = connect.prepareStatement("DELETE from employee_info WHERE id = ?;");
                    preparedStatement.setString(1, sc.nextLine());
                    preparedStatement.execute( );
                    statement=connect.createStatement();
                    result=statement.executeQuery("SELECT * From employee_info");
                    
                    while (result.next()) {
                    System.out.println("Name: " + result.getString("Name"));
                    System.out.println("Mobile: " + result.getString("Mobile"));
                    System.out.println("Age: " + result.getString("Age"));
                    }*/


        } catch(Exception ex){
            System.out.println(" "+ex);
    }
    
    }
    
    
    
}
