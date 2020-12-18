package softwareproject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


   abstract class DatabaseLink {
    
    
    private static Connection connection = null;
    
    static Connection getInstance() throws SQLException, ClassNotFoundException{
        if(connection == null){
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sp_final?"+"user=root");
        }
        
        return connection;
    }
    
}
