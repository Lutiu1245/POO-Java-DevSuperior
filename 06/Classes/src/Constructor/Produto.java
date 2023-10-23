package Constructor;

public class Produto {
    public String Name;
    public double Price;
    public int Quantity;

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