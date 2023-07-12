import java.sql.*;
package testConnection;
public class jdbcFirst 
{

    public static void main(String[]args)
    {
        String url="jdbc:oracle.thin:@localhost:1521:XE";
    try 
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded");
        Connection con=DriverManager.getConnection(url,"user","password");
        System.out.println("Connection Established");
        con.close();
    }
    catch(ClassNotFoundException e) 
    {
        System.out.println("driver not loaded");
    }
    catch(SQLException e)
    {
        System.out.println("Connection not established");
    }
    }
}