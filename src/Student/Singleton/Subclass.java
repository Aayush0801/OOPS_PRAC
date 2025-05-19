package Student.Singleton;

import Student.Encapsulation.Access;

public class Subclass extends Access {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(12,"Aayush");

        int a = obj.num;
        System.out.println(obj instanceof Object);
    }
}
