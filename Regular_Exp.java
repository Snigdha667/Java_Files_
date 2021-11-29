import java.util.regex.*;

public class Regular_Exp {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("sni");
        int count =0;
        String s = "snigdha sni singh";
        Matcher m = p.matcher(s);
        while (m.find()){
            count++;
            System.out.println(m.start()+" "+m.end());
        }
        System.out.println(count);
    }
}
