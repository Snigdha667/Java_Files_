import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Names {
    public static void main(String[] args) {
        String target = "neeeraj Naman narayan akarsh drishti";
        Pattern p = Pattern.compile("(N|n)[a-zA-Z]+");
        Matcher m = p.matcher(target);
        int ctr = 0;
        while(m.find())
        {
            System.out.println(ctr + " "+ m.group());
            ctr++;
        }
        System.out.println(ctr);

    }
}
