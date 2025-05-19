package Student.Engine;

public class Engine_Class {
    String Motor;
    int hp;

    public Engine_Class(String motor, int hp) {
        Motor = motor;
        this.hp = hp;
    }

    public Engine_Class() {
    }

    public Engine_Class(Engine_Class other){
        this.Motor = other.Motor;
        this.hp  = other.hp;
    }
    
}
