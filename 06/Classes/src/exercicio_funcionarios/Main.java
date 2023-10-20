package exercicio_funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome, salario bruto e valor do imposto: ");
        String name = sc.nextLine();
        double salarioBruto = sc.nextDouble();
        double imposto = sc.nextDouble();
        Funcionarios funcionario = new Funcionarios();
        funcionario.nome = name;
        funcionario.SalarioBruto = salarioBruto;
        funcionario.Imposto = imposto;
        System.out.println(funcionario);
        System.out.println("informe a porcentagem para aumentar o salario: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentarSalario(porcentagem);
        System.out.println(funcionario);
    }
}
