public abstract class Figures {
    private String name;
    public int price;
    private final int uniqueKod;

    public Figures (String name, int price, int uniqueKod) {
        this.price = price;
        this.uniqueKod = uniqueKod;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getUniqueKod() {
        return uniqueKod;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }


    public abstract double perimetr();

    public abstract double ploshad();



}
