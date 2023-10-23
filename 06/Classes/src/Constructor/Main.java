package Constructor;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double price = sc.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        int quantity = sc.nextInt();
        System.out.println("Digite o valor para adicionar a quantidade de produto no estoque: ");
        Produto p = new Produto(name, price, quantity);
        quantity = sc.nextInt();
        p.AddProducts(quantity);
        System.out.println("Digite a quantidade de produtos que quer remover do estoque:");
        quantity = sc.nextInt();
        p.RemoveProducts(quantity);
        System.out.println(p);
        sc.close();
    }
}
