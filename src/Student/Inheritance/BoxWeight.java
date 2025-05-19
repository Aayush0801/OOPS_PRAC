package Student.Inheritance;

public class BoxWeight extends Box{
    double weight;

    private double size;
    public BoxWeight(){
        super();
        this.weight = -1;
    }
    public BoxWeight(Box other, double weight){
        super(other);
        this.weight = weight;
    }
    public BoxWeight(BoxWeight other){
        super(other);//even though other is of the type boxweight it can still access the
        //constructor which take box as input as it is inherited from it and hence has all the
        //properties of it too
        this.weight = other.weight;
    }
    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);

        System.out.println("BoxWeight was called!");
        this.weight = weight;
    }
//    @Override
    public static void inforamtion(){
        System.out.println("Running the boxweight!");
    }
}
