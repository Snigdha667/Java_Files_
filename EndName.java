import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndName {
    public static void main(String[] args) {
        String target = "neeeraJ Naman narayan akarsh shitij";
        Pattern p = Pattern.compile("[a-zA-Z]+(j|J)");
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
