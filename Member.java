public class Member {
    String name;
    int age;
    int ph_no;
    String address;
    double salary;
    public void printSalary() {
        Employee obj1 = new Employee("Snigdha Singh", 19, 987654321, "ABC Lane, XYZ City",50000.00, "Java" );
        Manager obj2 = new Manager("Akarsh Singh", 25, 90000000, "PQR Lane, STU City", 90000.00, "Software Development");
        System.out.println("Employee Details :::");
        System.out.println("name :: "+obj1.name);
        System.out.print("age :: ");
        System.out.println(obj1.age);
        System.out.print("Phone No. :: ");
        System.out.println(obj1.ph_no);
        System.out.println("Address :: "+obj1.address);
        System.out.print("Salary :: ");
        System.out.println(obj1.salary);
        System.out.println("Specialization :: "+obj1.specialization);
        System.out.println("....................................................................");
        System.out.println("Manager Details :::");
        System.out.println("name :: "+obj2.name);
        System.out.print("age :: ");
        System.out.println(obj2.age);
        System.out.print("Phone No. :: ");
        System.out.println(obj2.ph_no);
        System.out.println("Address :: "+obj2.address);
        System.out.print("Salary :: ");
        System.out.println(obj2.salary);
        System.out.println("Department :: "+obj2.department);
    }
     Member(String name, int age, int ph_no, String address, double salary){
        super();
     }
     Member(){
        super();
     }

    public static void main(String[] args) {
        Member obj = new Member();
        obj.printSalary();

    }
}
class Employee extends Member{
    String specialization;

    Employee(String name, int age, int ph_no, String address, double salary, String specialization) {
        super(name, age, ph_no, address, salary);
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}
class Manager extends Member{
   String department;

    Manager(String name, int age, int ph_no, String address, double salary, String department) {
        super(name, age, ph_no, address, salary);
        this.department = department;
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;
        this.address = address;
        this.salary = salary;
    }
}