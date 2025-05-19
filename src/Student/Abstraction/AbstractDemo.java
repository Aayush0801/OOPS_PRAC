package Student.Abstraction;

public abstract class AbstractDemo {

    int age;


    public AbstractDemo(int age) {
        this.age = age;
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}

