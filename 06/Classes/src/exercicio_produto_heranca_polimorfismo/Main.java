package exercicio_produto_heranca_polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Quantos produtos? ");
        int n = sc.nextInt();
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        for (int i = 0; i < n; i++) {
            System.out.println("Comum, importado ou usado? (c/i/u)");
            char opction = sc.next().charAt(0);
            if (opction == 'c'){
                sc.nextLine();
                System.out.println("Entre com o nome: ");
                String name = sc.nextLine();
                System.out.println("Entre com o preço: ");
                double price = sc.nextDouble();
                product = new Product(name, price);
                products.add(product);
            }
            if (opction == 'i'){
                sc.nextLine();
                System.out.println("Entre com o nome: ");
                String name = sc.nextLine();
                System.out.println("Entre com o preço: ");
                double price = sc.nextDouble();
                System.out.println("Entre com o a taxa de importação: ");
                double tax = sc.nextDouble();
                product = new ImportedProduct(name, price, tax);
                products.add(product);
            }
            if (opction == 'u'){
                sc.nextLine();
                System.out.println("Entre com o nome: ");
                String name = sc.nextLine();
                System.out.println("Entre com o preço: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.println("Entre com a data de fabricação: ");
                Date date = dateFormat.parse(sc.nextLine());
                product = new UsedProduct(name, price, date);
                products.add(product);
            }
        }
        System.out.println("PRICE TAGS:");
        for (Object obj :
                products) {
            System.out.println(obj);
        }
    }
}
