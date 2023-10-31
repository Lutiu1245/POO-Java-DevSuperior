package exercicio_vetores_mediaProdutos;

public class Produto {
    public Produto(String name, double preco) {
        Name = name;
        Preco = preco;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    String Name;
    double Preco;
}
