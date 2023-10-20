package exercicio_cotacao_dolar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos dolares seram compardos?");
        Scanner sc = new Scanner(System.in);
        double dolares = sc.nextDouble();
        System.out.println(Cotacao.dolaresComprados(dolares));
        sc.close();
    }
}
