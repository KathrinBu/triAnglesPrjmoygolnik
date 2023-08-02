public class Triangle <perimetr, ploshad> extends Figures {
    private static final int uniqueKod = 329;
    double a,b, c;

    public Triangle(String name, double a, double b, double c, int price) {
        super(name, price, uniqueKod);
        this.a = a;
        this.b = b;
        this.c = c;
    }
     public double perimetr(){
      double perimetr = a+b+c;
         return perimetr;
    }

    public  double ploshad() {
        double polyP = perimetr()/2;
        double ploshad = Math.sqrt(polyP*(polyP-a)*(polyP-b)*(polyP-c));
        return ploshad;
    }
    }

