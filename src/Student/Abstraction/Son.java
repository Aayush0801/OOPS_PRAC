package Student.Abstraction;

public class Son extends AbstractDemo{
    int agency ;

    public Son(int age,int agency) {
        super(age);
        this.agency = agency;

    }


    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I like " + name + " they are " + age + " years old");
    }
}
