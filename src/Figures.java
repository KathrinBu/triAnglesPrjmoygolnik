import java.util.Scanner;

public abstract class Figures {
    private String name;

    public Figures (String name) {
        System.out.println("Its name:");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }
    public abstract double perimetr();

    public void plosad() {
        System.out.println("dliny storon treygolnika "+getName() + ":");
        Scanner scanner = new Scanner(System.in);
        int plosad = dlynaStorony*dlynaStorony;
    }

}
