import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test{
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InvalidDataException {
        String phone = "9876543210 09876543210 919876543210";
        String NAME = "mlknkv455 Ram j767 Aman";
        Pattern p = Pattern.compile("(0|91)+[7-9][0-9]{9}");
        Pattern p1 = Pattern.compile("(R|A)+\\w");
        Matcher m = p.matcher(phone);
        Matcher m1 = p1.matcher(NAME);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internal_marks","root","");
        PreparedStatement s = con.prepareStatement("insert into iinfoo values(?,?)");
        while(m1.find()&&m.find()) {
            s.setString(1, m.group());
            s.setString(2, m1.group());
            s.executeUpdate();
        }
        Statement ss = con.createStatement();
        ResultSet rs = ss.executeQuery("select * from iinfoo");
        int i=1;
        while(rs.next()) {
            if(i==1||i==10||i==11) {
                String k = rs.getString(2);
                if (k != "Snigdha" && k != "Ram" && k != "Aman") {
                    throw new InvalidDataException("String not found.");
                } else {
                    System.out.println(rs.getString(1) + " " + rs.getString(2));
                }
            }
            i++;
        }
            con.close();
    }
}
class InvalidDataException extends Exception{
    public InvalidDataException(String a){
        super(a);
    }
}