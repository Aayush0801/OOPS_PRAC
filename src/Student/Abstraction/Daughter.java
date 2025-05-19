package Student.Abstraction;

public class Daughter extends AbstractDemo{

    int age;


    public Daughter(int age) {
        super(age);

    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am going to be a " + name + " at the age of " +  age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }
}
