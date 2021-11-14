import java.util.Scanner;

public class Student1 {
    String name;
    int age;
    String address;

    Student1() {
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public void setInfo(String n1, int a1) {
        System.out.println(n1 );
        System.out.print(a1 );
        System.out.print(address );
    }

    public void setInfo(String n2, int a2, String ad2) {
        System.out.println(n2 );
        System.out.print(a2 );
        System.out.print(ad2 );
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setInfo("Ciya", 12);
        obj.setInfo("Diya", 14, "Abc street, xyz City");
        obj.setInfo("Giya", 13);
        obj.setInfo("Hiya", 16);
        obj.setInfo("Jiya", 17);
        obj.setInfo("Piya", 13, "Pqr street, lmn City");
        obj.setInfo("Riya", 19);
        obj.setInfo("Siya", 14);
        obj.setInfo("Tiya", 17);
        obj.setInfo("Ziya", 16);
    }
}
