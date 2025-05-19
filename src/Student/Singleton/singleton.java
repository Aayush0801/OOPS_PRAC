package Student.Singleton;

public class singleton {
    private singleton(){

    }


    //as this doesnt depend on the object right
    private static singleton instance;

    public static singleton getInstance(){
        if(instance == null) {
            instance = new singleton();
        }

        return instance;
    }
}
