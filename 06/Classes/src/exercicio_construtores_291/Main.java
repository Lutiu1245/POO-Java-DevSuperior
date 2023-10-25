package exercicio_construtores_291;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Entre com o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Quer iniciar com um valor inicial? (s/n)");
        char caracter = sc.next().charAt(0);
        if (caracter == 's') {
          System.out.println("Entre com o valor inicial: ");
          double inicial = sc.nextDouble();
            Conta conta = new Conta(numero, titular, inicial);
            System.out.println("nome do titular: " + conta.getTitular() + ", número da conta: " + conta.getNumero());
            System.out.println("Entre com o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta.Depositar(deposito);
            System.out.println(conta);
            System.out.println("Entre com o valor do saque: ");
            double saque = sc.nextDouble();
            conta.Sacar(saque);
            System.out.println("valor dentro da conta: " + conta.getSaldo());
        }
        else {
            Conta conta = new Conta(numero, titular);
            System.out.println("nome do titular: " + conta.getTitular() + ", número da conta: " + conta.getNumero());
            System.out.println("Entre com o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta.Depositar(deposito);
            System.out.println(conta);
            System.out.println("Entre com o valor do saque: ");
            double saque = sc.nextDouble();
            conta.Sacar(saque);
            System.out.println("valor dentro da conta: " + conta.getSaldo());
        }
    }
}
