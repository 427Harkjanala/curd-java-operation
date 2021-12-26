
// Connecting to the Database
import java.sql.*;
 
public class Student
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
             
            // Establishing Connection
            Connection con = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/Studdb","root","");
 
            if (con != null)            
                System.out.println("Connected");           
            else           
                System.out.println("Not Connected");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}