import java.sql.*;

public class Emp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysqll","root","");
        Statement s = conn.createStatement();
        ResultSet rss = s.executeQuery("select * from emp");
        while(rss.next()){
            System.out.println(rss.getInt(1)+" "+rss.getString("ename"));
        }
    }
}