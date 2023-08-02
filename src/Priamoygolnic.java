public class Priamoygolnic<perimetr, ploshad> extends Figures {

    private static final int uniqueKod = 578;
    private static int price = 20;
    double a, b;

    public Priamoygolnic(String name, double a, double b) {
        super(name, price, uniqueKod);
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimetr() {
        double perimetr = 2*(a+b);
        return perimetr;
    }

    @Override
    public double ploshad() {
        double ploshad = a*b;
        return ploshad;
    }
}
