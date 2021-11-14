import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Palindrome obj = new Palindrome();
        int a = s.nextInt();
        int b = a;
        int c;
        int d = 0;
        while(a>=1){
          c=a%10;
            d = (10 * d) + c;
          a=a/10;
        }
        if(d==b){
            System.out.println(b+ " is a palindrome");
        }
        else{
            System.out.println(b+ " is not a palindrome");
        }
    }
}
