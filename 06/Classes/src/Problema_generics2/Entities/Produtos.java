package Problema_generics2.Entities;

public class Produtos implements Comparable<Produtos> {
    private String name;
    private Double price;

    public Produtos(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Produtos o) {
        return price.compareTo(o.getPrice());
    }
}
