package Student.PolyMorphism;

public class Shape {
     void area(){
        System.out.println("I am in shapes");
    }


    // since final was used here that meant that this function cant be overriden and therefore we would start
    //getting errors
//    final void area(){
//        System.out.println("I am in shapes");
//    }
}
