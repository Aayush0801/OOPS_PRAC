package Student.Encapsulation;

public class Access {
    protected int num;
    protected String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
