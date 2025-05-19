package Student.Singleton;

import Student.Encapsulation.Access;

public class Main extends Access {


    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        singleton obj1 = singleton.getInstance();
//        singleton obj2 = singleton.getInstance();
//        singleton obj3 = singleton.getInstance();

        Main a  = new Main(24,"Aayush");

        int l  = a.num;

    }
}
