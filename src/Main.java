
//package has been imported
import Student.SayHello;

public class Main {
    public static class student{
        int roll_no;
        String name;
        double marks;

        public student(int roll_no, String name, double marks) {
            this.roll_no = roll_no;
            this.name = name;
            this.marks = marks;
        }

        //method of calling a constructor from another constructor
        public student(){
            this (1222,"Aayush",45.43f);
        }

        public student(student s){
            this.name = s.name;
            this.marks= s.marks;
            this.roll_no=s.roll_no;
        }
        @Override
        public String toString() {
            return "student{" +
                    "roll_no=" + roll_no +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static void main(String[] args) {


        student s = new student (123,"Aayush",34.3);

        SayHello test = new SayHello();

        test.sayHello();

        //shallow copy only points to the memory location and is not a new type of object

//        student s1= new student(s);

//        s.name = "Pooja";
//        System.out.println(s1.name);
//        System.out.println(s.toString());

    }
}