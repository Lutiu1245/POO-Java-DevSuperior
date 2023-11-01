package Desafio_ContribuinteOO_e_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("De quantas pessoas ira ser feitos o calculo?");
        int n = sc.nextInt();
        List<Imposto> contruibuinte = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com  salario anual do contribuinte " + i);
            double salario = sc.nextDouble();
            System.out.println("Entre com a pretação de serviços: ");
            double prestacao = sc.nextDouble();
            System.out.println("Entre com o ganho capital: ");
            double capital = sc.nextDouble();
            System.out.println("Gastos médicos: ");
            double medicos = sc.nextDouble();
            System.out.println("Gastos educacionais: ");
            double educacionais = sc.nextDouble();
            contruibuinte.add(new Imposto(salario, prestacao, capital, medicos, educacionais));
        }

        for (Imposto obj : contruibuinte) {
            System.out.println("Resumo do contribuinte: ");
            System.out.println(obj);
        }
    }
}
