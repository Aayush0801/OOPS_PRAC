package Student.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
//        System.out.println(box.l + " " + box.w + " " + box.h); gives error has l is private in the box class

//        BoxWeight boxWeight = new BoxWeight();
//
//        System.out.println(boxWeight.h  + " " + boxWeight.weight);

//        BoxWeight box1 = new BoxWeight(1,2,3,5);

//        System.out.println(box1.weight); this gives an error because of the fact that it is not of the type
        //boxweight (reference), rest all we can have access to


        // we can access all the properties of elements in the ref type i.e for this case BoxWeight
        //so we can access weight too, but since the object type is Box it doesnt have a weight prop so
        // we get an error
//        BoxWeight boxweight= new Box(1,2,3); //this gives an error too

//        BoxPrice boxPrice = new BoxPrice(1,2,3,4,200);

//        BoxPrice price1 = new BoxPrice();

//        BoxPrice price3 = new BoxPrice(24,50, 500);
//
//        System.out.println(price3.l + " " + price3.w  + " " + price3.h + " " + price3.weight + " " + price3.price);
//        Box box2 = new BoxWeight();

        //note that L was private but we still got it because we were able to call it via the class method which can use l
        //this thing of getting private properties is called as data hiding
        System.out.println(box.getL());
    }
}
