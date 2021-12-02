import java.sql.*;

public class Display {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mysqll", "root", "");
            Statement s = conn.createStatement();
            ResultSet rss = s.executeQuery("select * from emp");
            int i = 0;
            while (rss.next()) {
                i++;
            }
            if (i > 0) {
                System.out.println("Connection Stablished Successfully");
            }
        }catch(Exception e){
            System.out.println("Connection could not be established "+e);
        }
    }
}
