package Student;

public class StaticBlock {
    static int a = 4;
    static int b ;

    static{
        System.out.println("Hello from static block");
        b = a*4;
    }

    public static void main(String[] args) {

        //will call the static block and the inside static block print statement will be executed
        StaticBlock staticBlock = new StaticBlock();

        //newly initialised things we will be able to see
        System.out.println(staticBlock.a + " "  + staticBlock.b);

        //now we increase b by 100
        staticBlock.b+=100;


        //now the static block wont be callled as it was already called once
        StaticBlock staticBlock1 = new StaticBlock();
        //therefore here the things will remain the same as they are class variables
        System.out.println(staticBlock1.a + " " +  staticBlock1.b);
    }

}
