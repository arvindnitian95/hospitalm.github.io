
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class Databaseconnection {
     
    public static Connection getConnection()
    {
        Connection con=null;
       try{  
Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  

return con;
}catch(Exception e){ System.out.println(e);} 
       return con;
    }

    PreparedStatement prepareStatement(String select__from_appointment_where_id_and_mob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
