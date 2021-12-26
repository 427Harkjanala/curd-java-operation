
// inserting to the Database
import java.sql.*;
 
public class Insert
{
    public static void main(String args[])
    {
        int Sno = "101";
        String Sname= "Hark";
        Date Dob = "25/01/2000";
        Date Doj = "25/12/2021";
         
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("
             jdbc:mysql://localhost:3306/Studdb","root","");
            Statement stmt = con.createStatement();
             
            // Inserting data in database
            String s = "insert into Student values('" +sno+ "', '" +sname+
                                  "', '" +Dob+ "', '" +Doj+ "')";
            int x = stmt.executeUpdate(s);
            if (x > 0)           
                System.out.println("Successfully Inserted");           
            else           
                System.out.println("Insert Failed");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}