package Student.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(12,23);

        Daughter daughter = new Daughter(12);
        son.career("Engineer");

        son.partner("Srish" , 21);

        daughter.career("Coder");
        daughter.partner("Lolz" , 17);//as you can see for daughter the bod of the method was different that is why it worked

    }
}
