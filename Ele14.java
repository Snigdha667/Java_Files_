import java.util.Scanner;

public class Ele14 {
    int arr[];
    int n;

    Ele14() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

    public boolean result() {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] == 1) | (arr[i] == 4)) {
                c = c + 1;
            }
        }
        if(c==n){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Ele14 obj = new Ele14();
        System.out.println(obj.result());
    }

}
