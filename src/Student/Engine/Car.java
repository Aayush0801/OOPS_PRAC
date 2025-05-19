package Student.Engine;

public class Car extends Engine_Class{
    int wheels;
    boolean ic;

    public Car(String motor, int hp, int wheels, boolean ic) {
        super(motor, hp);
        this.wheels = wheels;
        this.ic = ic;
    }

    public Car(int wheels, boolean ic) {
        this.wheels = wheels;
        this.ic = ic;
    }

    public Car(Engine_Class other, int wheels, boolean ic) {
        super(other);
        this.wheels = wheels;
        this.ic = ic;
    }
}
