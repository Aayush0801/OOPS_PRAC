package Student;

public class InnerClass {

    static class Test {
        int marks;

        public Test(int marks) {
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Test a = new Test(34);//as Test is non static it cant be called inside the static method
        Test b = new Test(37);//as Test is non static it cant be called inside the static method
    }
}
