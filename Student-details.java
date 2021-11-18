public class Student {
    String name;
    int age;
    String program;

    Student(String n, int a, String p) {
        super();
    }
    public void display_student_info() {
    }
}
class Graduate_Student extends  Student{
    double percentage;
    String stream;

    Graduate_Student(String n, int a, String p,double per, String s) {
        super(n, a, p);
        name = n;
        age = a;
        program = p;
        percentage =per;
        stream =s;
    }
    @Override
    public void display_student_info(){
        System.out.println("Graduate Student");
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("program : "+program);
        System.out.println("percentage : "+percentage);
        System.out.println("stream : "+stream);
    }
}
class Research_Student extends Student {
    String specialization;
    int experience;

    Research_Student(String n, int a, String p, String sp, int e) {
        super(n, a, p);
        name = n;
        age = a;
        program = p;
        specialization = sp;
        experience = e;
    }
    @Override
    public void display_student_info() {
        System.out.println("Research Student");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("program : " + program);
        System.out.println("specialization : " +specialization);
        System.out.println("experience : " + experience);
    }
}

class Display{
    public static void main(String[] args) {
        Graduate_Student obj1 = new Graduate_Student("Snigdha Singh",19,"Btech", 91.20, "Computer Science ");
        Research_Student obj2 = new Research_Student("Snigdha Singh", 23, "Mtech", "DataStructures and Algorithms",1);
        obj1.display_student_info();
        obj2.display_student_info();
    }
}