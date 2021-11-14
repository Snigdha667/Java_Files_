public class Student {
    String name;
    double percentage;
    Student(String n, double p){
        name = n;
        percentage = p;
    }
}
class Test {
    public static void main(String[] args) {
        Student obj1 = new Student("Riya", 67.77);
        Student obj2 = new Student("Tiya", 98.90);
        Student obj3 = new Student("Siya", 78.34);
        if (obj1.percentage > obj2.percentage) {
            if (obj1.percentage > obj3.percentage) {
                System.out.println(obj1.name + " " + obj1.percentage);
            }
        }
        else if(obj2.percentage>obj1.percentage){
            if(obj2.percentage>obj3.percentage){
                System.out.println(obj2.name + " " + obj2.percentage);
            }
        }
        else{
            System.out.println(obj3.name + " " + obj3.percentage);
        }
    }
}
