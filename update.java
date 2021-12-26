
// updating the Database
import java.sql.*;
 
public class Update
{
    public static void main(String args[])
    {
        int sno = "sno";
        String sname = "Sname";
        Date Dob = "Dob";
        Date Doj = Doj;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("
             jdbc:mysql://localhost:3306/Studdb","root","");
            Statement stmt = con.createStatement();
         
            // Updating database
            String s = "UPDATE student set Sname = '" + Sname +
                    "' WHERE sno = '" +sno+ "' AND Sname = '" + Sname + "'";
            int x = stmt.executeUpdate(s);
             
            if (x > 0)           
                System.out.println("Password Successfully Updated");           
            else           
                System.out.println("ERROR OCCURED :");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}