import java.util.Scanner;

public class Arrray {
    int arr[];
    Arrray(){
        arr = new int[]{1,4,34,56,7};
    }

    public static void main(String[] args) {
        Arrray obj = new Arrray();
        Scanner s = new Scanner(System.in);
        int ss = s.nextInt();
        int c=0;
        for(int i =0;i<obj.arr.length;i++){
            if(obj.arr[i]==ss){
                c=c+1;
                System.out.println(i);
            }
        }
        if(c==0){
            System.out.println("-1");
        }
    }
}
