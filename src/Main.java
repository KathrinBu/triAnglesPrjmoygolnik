import java.util.ArrayList;

public class Main {
    private static java.lang.String String;

    public static void main(String[] args) {
        triangle();
        priamoygolnic();
    }

      public static void triangle(){
          Triangle triangle1 = new Triangle<>("First",3,4,5, 399);
          Triangle triangle2 = new Triangle<>("Second",7.1,8,9, 76);
          triangle1.setPrice(11);
          triangle2.getUniqueKod();
          triangle1.perimetr();
          triangle1.ploshad();
          triangle2.perimetr();
          triangle2.ploshad();
           System.out.println(" First triangle has: " + "\n" + "ploshad - " + triangle1.ploshad() +
                   "\n"+ "UniqueKod - " + triangle1.getUniqueKod());
           System.out.println(" Second triangle has: " + "\n" + "perimetr - " + triangle1.perimetr() +
                    "\n"+ "Price - " + triangle1.getPrice());

      }

    public  static void priamoygolnic() {
        Priamoygolnic priamoygolnic = new Priamoygolnic("Rectangle", 6, 7);
        priamoygolnic.getUniqueKod();
        priamoygolnic.setPrice(33);
        priamoygolnic.getPrice();
        priamoygolnic.perimetr();
        priamoygolnic.ploshad();
        System.out.println(" Rectangle has:" + "\n"+ "ploshad - " + priamoygolnic.ploshad() +
                "\n" + "perimetr - " + priamoygolnic.perimetr() + "\n" + "UniqueKod - " +
                priamoygolnic.getUniqueKod() + "\n" + "Price - " + priamoygolnic.getPrice());
    }
    }

