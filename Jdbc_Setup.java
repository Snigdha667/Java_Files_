import java.sql.*;

public class yyyy{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from cities");
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getBoolean(1)+" "+rs.getInt(1));
        }
        con.close();
    }
}
