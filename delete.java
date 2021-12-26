
// deleting from Database
import java.sql.*;
 
public class Delete
{
    public static void main(String args[])
    {
        int sno = "sno";
        String sname = "sname";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("
               jdbc:mysql://localhost:3306/Studdb","root","");
            Statement stmt = con.createStatement();
                  
            // Deleting from database
            String s = "DELETE from Student WHERE sno = '" + sno +
                    "' AND Sname = '" + Sname + "'";
                     
            int x = stmt.executeUpdate(s);
             
            if (x > 0)           
                System.out.println("One User Successfully Deleted");           
            else
                System.out.println("ERROR OCCURED :("); 
           
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}