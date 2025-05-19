package Student;

public class Human {
    static long population;
    static String hello = "Hello from Test static member, I can be accessed without creating any object that is so cool right!";
    String name;
    int age;
    int salary;
    boolean married;

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
