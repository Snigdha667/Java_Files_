//representation of sql injection with statement object and PreparedStatement object

// TABLE NAME = student
// FIELDS NAME = rollno, name, marks

import java.sql.*;
import java.util.Scanner;
public class IjdbcExample {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/GLAI21", "root", "");
    // fire these sql injections with name at the time of execution one by one
    //'neeraj' or ''=''";
   // 'neeraj' or '='='='";
    // 'neeraj' or 1=1";
    System.out.println("enter the name ");
    String name1 = new Scanner(System.in).nextLine();
    String str = "select * from student where name ="+ name1;
    System.out.println("With Statement Object"); // not sql injection safe
    // values will display on the console  with using  statement object  because it not handles the sql injections
    Statement s = con.createStatement();
    ResultSet rs = s.executeQuery(str);
    while(rs.next())
    {
      System.out.println(rs.getInt("rollno")+ "    "+ rs.getString("name")+ "  "+ rs.getInt(3));
    }
    // used for delay
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // with prepared statement              sql injection safe

    // no value will display on the console  with using prepared statement because it handles the sql injections

    System.out.println("With PreparedStatement object  ");
    String str1 = "select * from student where name = ?";
    PreparedStatement ps1 = con.prepareStatement(str1);
    ps1.setString(1,name1);
    ResultSet rs1 = ps1.executeQuery();
    while(rs1.next())
    {
      System.out.println(rs1.getInt("rollno")+ "    "+ rs1.getString("name")+ "  "+ rs1.getInt(3));
    }

    // callable statement
    // remember with CallableStatement we can only use execute method
    // this is the way we call the stored procedure from java by using the CallableStatement object
    CallableStatement cs = con.prepareCall("{call methodname(?,?)}");
    cs.execute();



  }
}