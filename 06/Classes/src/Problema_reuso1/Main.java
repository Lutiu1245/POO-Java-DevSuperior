package Problema_reuso1;

import Problema_reuso1.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> valores = new PrintService<Integer>();
        System.out.println("Entre com o valor do n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com um numero:");
            int numero = sc.nextInt();
            valores.addValue(numero);
        }
        valores.first();
        valores.print();
    }
}
