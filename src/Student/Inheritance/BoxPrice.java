package Student.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        System.out.println("BoxPrice class is called!");
        this.price = price;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(){
        super();
        this.price = -1;
    }
    public BoxPrice(double side, double weight, double price){
        super(side, weight);
        this.price = price;
    }

}
