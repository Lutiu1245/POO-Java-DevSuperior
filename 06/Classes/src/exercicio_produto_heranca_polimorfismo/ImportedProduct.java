package exercicio_produto_heranca_polimorfismo;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(){

    }
    public ImportedProduct(double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " R$" + totalPrice() + " (" + "taxa de importação:" + customsFee + ")";
    }

    public double totalPrice() {
        return price + customsFee;
    }
}
