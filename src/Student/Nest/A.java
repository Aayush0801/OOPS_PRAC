package Student.Nest;

public class A {
    public interface Nested{
        boolean isOdd(int num);
    }
}
class B implements A.Nested{
    @Override
    public boolean isOdd(int num) {
        return num%2 == 1;
    }

}

class Main{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.isOdd(2));
    }
}