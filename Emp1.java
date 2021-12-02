import java.sql.*;
public class Emp1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysqll", "root", "");
        Statement s = conn.createStatement();
        ResultSet rss = s.executeQuery("select * from emp");
        while (rss.next()) {
            if(rss.getInt("sal")>1000 && rss.getInt("sal")<2000){
                System.out.println(rss.getString("ename") + " " + rss.getString("job")+" "+
                        +rss.getInt("sal")+" "+rss.getString("comm"));
            }
        }
    }
}