package bank.management.system;      //JDBC Connection has 5 steps : - 1. Register the driver 2. Create Connection 3. Create statement 4. Execute query 5. Close Connection
import java.sql.*;
public class Conn 
{
    Connection c; //global object for Connection class to create connection
    Statement s; //global object for Statement class to create statement
  public Conn()
  {
      try                    //exception Handing cz mysql is an external entity it can throw error at runtime
      {
         
         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","12345"); //Creating Connection
         s=c.createStatement(); //create statement to excecute queries
         
         
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
}
    

