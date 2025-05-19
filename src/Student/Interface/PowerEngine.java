package Student.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {System.out.println("I stop");
    }

    @Override
    public void acc() {
        System.out.println("Grrrrrrrrrrrrrrrr");
    }
}
