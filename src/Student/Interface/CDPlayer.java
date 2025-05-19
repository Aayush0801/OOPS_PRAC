package Student.Interface;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Turning on the music");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the music");
    }
}
