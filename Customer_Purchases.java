import java.util.Scanner;

public class Customer_Purchases {
    private int number;
    private String first_name;
    private String surname;
    private String product;
    private double price;
    private int quantity;
    Customer_Purchases oo = new Customer_Purchases();
    Scanner s = new Scanner(System.in);
    public int getNumber() {
        number = s.nextInt();
        return number;
    }

    public void setNumber(int number) {
        this.number = oo.getNumber();
    }

    public String getFirst_name() {
        first_name = s.next();
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = oo.getFirst_name();
    }

    public String getSurname() {
        surname = s.next();
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = oo.getSurname();
    }

    public String getProduct() {
        product = s.next();
        return product;
    }

    public void setProduct(String product) {
        this.product = oo.getProduct();
    }

    public double getPrice() {
        price = s.nextDouble();
        return price;
    }

    public void setPrice(double price) {
        this.price = oo.getPrice();
    }

    public int getQuantity() {
        quantity = s.nextInt();
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = oo.getQuantity();
    }
}
class Printing{
    Customer_Purchases obj1 = new Customer_Purchases();
    public void printDetails(){
        System.out.println("Print Customer Invoice ::");
        System.out.println("Number :: "+obj1.getNumber());
        System.out.println("First Name :: "+obj1.getFirst_name());
        System.out.println("Surname :: "+obj1.getSurname());
        System.out.println("Product Name :: "+obj1.getProduct());
        System.out.println("Price :: "+obj1.getPrice());
        System.out.println("Quantity :: "+obj1.getQuantity());
    }
    public void customerPurchase_Report(){
        //print:
        //report option %
        //tax 15%
        //commission 8.5%
        //discount 10%
        //total (price + tax) - (discount + commission)
        double tax = obj1.getPrice()*(double)15/100;
        double commission = obj1.getPrice()*(double) 85/1000;
        double discount = obj1.getPrice()*(double)1/10;
        double total = (obj1.getNumber() + tax) - (discount + commission);
        System.out.println("REPORT OPTION PERCENTAGE ::");
        System.out.println("Tax :: "+tax);
        System.out.println("Commission :: "+commission);
        System.out.println("Discount :: "+discount);
        System.out.println("Total Price :: "+total);
    }

    public static void main(String[] args) {
        //capture all customer purchase details req. to produce reports
        Printing p = new Printing();
        p.printDetails();
        p.customerPurchase_Report();
    }
}
