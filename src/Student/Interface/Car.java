package Student.Interface;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("I have abs");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop");
    }

    @Override
    public void acc() {
        System.out.println("Grrrrrr");
    }
}
