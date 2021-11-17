import java.util.Scanner;

public class FeesCal {
    double min = 10000.00;
    double total = 0.00;
    //Original >=50000
    //if deposit >=original/2 then 5% discount
    //total = school levy + sports fee; school levy = 10% of original, sports fee = 5% of original
    //Cal total
    //Program must request user to enter fees >50,000, also enter amount to deposit
    double original;
    double deposit;
    FeesCal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter original fees to deposit i.e. > Rs.50,000 ::");
        original =s.nextDouble();
        deposit =s.nextDouble();
    }

    public static void main(String[] args) {
        FeesCal obj = new FeesCal();
        obj.total = obj.original;
        if (obj.deposit >= obj.original/2){
            obj.total -= obj.total*(double)1/20;
        }
        double school_levy = obj.original*(double)1/10;
        double sports_fee = obj.original*(double)1/20;
        obj.total += school_levy + sports_fee;
        System.out.print("Total fees to deposit :: ");
        System.out.print(obj.total);
    }


}
