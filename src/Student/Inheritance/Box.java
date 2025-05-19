package Student.Inheritance;

import java.sql.SQLOutput;

//you add final here and that would make sure that this class cant be inherited
public class Box {
    private double l;
    double h;
    double w;

    public Box(double l, double h, double w) {
        System.out.println("Box Class was called!");
        this.l = l;
        this.h = h;
        this.w = w;
    }


    public double getL() {
        return l;
    }

    public Box() {
        this(-1,-1,-1);
    }

    //cube
    public Box(double l) {
//        super();// calls the Object class which is daddy of all the objects from java

        this.l = l;
        this.w = l;
        this.h = l;
    }

    public Box(Box old){
        this.l = old.l;
        this.h =old.h;
        this.w = old.w;
    }

    public static void inforamtion(){
        System.out.println("Running the box!");
    }
}
