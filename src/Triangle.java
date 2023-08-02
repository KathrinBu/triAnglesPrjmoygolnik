public class Triangle<perimetr, ploshad> extends Figures {
    double a,b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String name) {
        super(name);
    }
     public double perimetr(){
      double perimetr = a+b+c;
         return perimetr;
    }

    public  double ploshad() {
        double ploshad = Math.sqrt(perimetr());
        return ploshad;
    }
    }

