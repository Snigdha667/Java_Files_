public class Student {
    String name;
    int age;
    String program;

    Student(String n, int a, String p) {
        name = n;
        age = a;
        program = p;
    }
    public void display_student_info() {
        obj1.display_student_info();
        obj2.display_student_info();
    }

    Graduate_Student obj1 = new Graduate_Student("Snigdha Singh",19,"Btech", 91.20, "Computer Science ");
    Research_Student obj2 = new Research_Student("Snigdha Singh", 23, "Mtech", "DataStructures and Algorithms",1);

    public static void main(String[] args) {
        Student obj = new Student("AB",100000,"@@");
        obj.display_student_info();
    }
}
class Graduate_Student extends  Student{
    double percentage;
    String stream;

   Graduate_Student(String n, int a, String p,double per, String s) {
        super(n, a, p);
        percentage =per;
        stream =s;
    }
    @Override
    public void display_student_info(){
        System.out.println("Graduate Student");
        System.out.println("name : "+obj1.name);
        System.out.println("age : "+obj1.age);
        System.out.println("program : "+obj1.program);
        System.out.println("percentage : "+obj1.percentage);
        System.out.println("stream : "+obj1.stream);
    }
}
class Research_Student extends Student {
    String specialization;
    int experience;

    Research_Student(String n, int a, String p, String sp, int e) {
        super(n, a, p);
        specialization = sp;
        experience = e;
    }


    @Override
    public void display_student_info() {
        System.out.println("Research Student");
        System.out.println("name : " + obj2.name);
        System.out.println("age : " + obj2.age);
        System.out.println("program : " + obj2.program);
        System.out.println("specialization : " + obj2.specialization);
        System.out.println("experience : " + obj2.experience);
    }
}
