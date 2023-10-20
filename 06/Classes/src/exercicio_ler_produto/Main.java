package exercicio_ler_produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double price = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantity = sc.nextInt();
        Produto p = new Produto();
        p.Name = name;
        p.Price = price;
        p.Quantity = quantity;
        System.out.println("Dados do produto: " + p.Name + ", R$" + p.Price + ", " + p.Quantity + " unidades, Total: R$" + p.TotalValueInStock());
        System.out.println("Digite o valor para adicionar a quantidade de produto no estoque: ");
        quantity = sc.nextInt();
        p.AddProducts(quantity);
        System.out.println("Digite a quantidade de produtos que quer remover do estoque:");
        quantity = sc.nextInt();
        p.RemoveProducts(quantity);
        System.out.println("Dados do produto: " + p.Name + ", R$" + p.Price + ", " + p.Quantity + " unidades, Total: R$" + p.TotalValueInStock());
        sc.close();
    }
}
