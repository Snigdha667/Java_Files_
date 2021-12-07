import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailId {
    public static void main(String[] args) {
        String target = "snigdhasingh@gmail.com";
        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|rediff|yahoo)[.]com");
        Matcher m = p.matcher(target);
        int ctr = 0;
        while(m.find()){
            ctr++;
            System.out.println(ctr + " "+ m.group());
        }
        System.out.println(ctr);
        if(ctr==1){
            System.out.println("Mail id is valid");
        }
        else{
            System.out.println("Mail id is invalid");
        }

    }
}
