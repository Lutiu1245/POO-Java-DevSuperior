package Constructor;

public class Produto {
    private String Name;
    private double Price;
    private int Quantity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public Produto(String Name, double Price, int Quantity) {
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public double TotalValueInStock() {
        return Price * Quantity;
    }

    public void AddProducts(int quantity) {
        this.Quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.Quantity -= quantity;
    }

    public String toString() {
        return Name
                + ", R$" + Price + ", " + Quantity + " unidades, Total: R$" + TotalValueInStock();
    }
}