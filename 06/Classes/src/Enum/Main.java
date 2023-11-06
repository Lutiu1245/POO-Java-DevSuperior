package Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o nome do cliente: ");
        String name = sc.nextLine();
        System.out.println("Entre com o email do cliente: ");
        String email = sc.nextLine();
        System.out.println("Entre com a data de aniversario: ");
        Date date = dateFormat.parse(sc.nextLine());
        Client client = new Client(name, email, date);
        System.out.println("Entre com a data do pedido: (dd/mm/yyyy) ");
        Date dateOrder = dateFormat.parse(sc.nextLine());
        System.out.println("Entre com o status do pedido: ");
        OrderStatus pedido = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(dateOrder, pedido);
        System.out.println("Entre com a quantidade de produtos: ");
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nameProduct = sc.nextLine();
            double priceProduct = sc.nextDouble();
            int quantityProduct = sc.nextInt();
            vect[i] = new Produto(nameProduct, priceProduct, quantityProduct);
        }
        System.out.println(order);
        System.out.println(client);
        for (Object obj :
                vect) {
           System.out.println(obj);
        }
    }
}
