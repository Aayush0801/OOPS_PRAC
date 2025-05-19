package Student.Singleton;

public class Subclass2 extends Subclass{
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(12,"Aayush");

        int k=  obj.num;//protected can only be used through subclasses in different package

    }
}
