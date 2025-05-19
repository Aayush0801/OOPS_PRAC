package Student.Interface;

public class NiceCar {
    private Engine engine;
    private Media media;
    public NiceCar(){
        engine = new PowerEngine();
        media = new CDPlayer();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.stop();
    }
    public void playMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }

    public void upgradeEngine(){
        this.engine  = new ElectricEngine();
    }
}
