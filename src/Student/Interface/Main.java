package Student.Interface;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        CDPlayer cdPlayer = new CDPlayer();
//        PowerEngine powerEngine = new PowerEngine();

            NiceCar niceCar = new NiceCar();

            niceCar.start();
            niceCar.playMusic();
            niceCar.stop();
            niceCar.stopMusic();
            niceCar.upgradeEngine();
            niceCar.start();


//        powerEngine.start();
//        cdPlayer.start();
//        Engine car1 = new Car(); this is also allowed

//        car.start();
//        car.acc();
//        car.stop();
//        car.brake();
    }
}
