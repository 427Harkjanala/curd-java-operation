
// selecting from Database
import java.sql.*;
 
public class Select
{
    public static void main(String args[])
    {
        int sno = "sno";
        String Sname = "Sname";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("
                     jdbc:mysql://localhost:3306/Studdb","root","");
            Statement stmt = con.createStatement();
             
            // SELECT query
            String s = "select * from Student WHERE sno= '" + sno +
                                    "' AND sname = '" + sname + "'";
            ResultSet rs = stmt.executeQuery(s);
            if (rs.next())
            {
                System.out.println("sno : " + rs.getInt(1));
                System.out.println("sname :" + rs.getString(2));
                System.out.println("Dob :" + rs.getDate(3));
                System.out.println("Doj :"+ rs.getDate(4))
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}