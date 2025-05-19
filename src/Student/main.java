package Student;

import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args) {

//        System.out.println(Human.hello);
//
//
//        Human aayush = new Human("Aayush",23,10000,false);
//        System.out.println(Human.population);
//        Human srish = new Human("srish",23,10000,false);
//        System.out.println(Human.population);
//        Human srish1 = new Human("srish",23,10000,false);
//        System.out.println(Human.population);


        //once we create an object for the class then there is no issue in using the non static methods
        main testobg =new main();

        testobg.fun2();


    }


    static void fun(){
//        greeting(); //gives error as greeting is Test nonstatic function in the class and therefor we need to create an object for it first

        main obj = new main();
        obj.greeting();//now this works as we created an object and then called it
    }

    void greeting(){
        System.out.println("Hellooo from Test non static object!");
    }

    void fun2(){
        greeting();//we can do this as fun2 is nonstatic and therefore to use fun2 an object has to be created
    }
}
