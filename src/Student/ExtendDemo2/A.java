package Student.ExtendDemo2;

public interface A {
    default void fun(){
        System.out.println("Hello I am in A");
    }
}
