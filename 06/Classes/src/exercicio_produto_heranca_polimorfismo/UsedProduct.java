package exercicio_produto_heranca_polimorfismo;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name  + " (used) R$" + price + "(" + "data de fabricação: " + manufactureDate + ")";
    }
}
