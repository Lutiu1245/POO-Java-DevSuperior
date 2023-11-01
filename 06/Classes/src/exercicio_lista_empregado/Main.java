package exercicio_lista_empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de funcionarios: ");
        int n = sc.nextInt();
        List<Empregado> funcionarios = new ArrayList<Empregado>();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os valores de Id, Nome e Salario do funcionario: ");
            int id = sc.nextInt();
            while (idExist(id, funcionarios)) {
                System.out.print("O id já existe, tente novamente com um id diferente ");
                id = sc.nextInt();
            }
            sc.nextLine();
            String nome = sc.nextLine();
            double salario = sc.nextDouble();
            funcionarios.add(new Empregado(id, nome, salario));
        }


        System.out.println("Entre com o Id do funcionario que voce quer dar um aumento: ");
        int id = sc.nextInt();
        Empregado empregados = filtraIdEmpregado(id, funcionarios);
        if (empregados == null)
        {
            throw new IllegalArgumentException("Id não existe");
        }
        System.out.println("Digite o valor de quantos porcentos será acrescentado ao salario");
        double porcento = sc.nextDouble();
        empregados.increaseSalary(porcento);


        System.out.println("Funcionários cadastrados:");
        for (Object empregado : funcionarios) {
            System.out.println(empregado);
        }
    }
    public static boolean idExist(int id, List<Empregado> funcionarios) {
        //
        Empregado empregado = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return empregado != null;
    }

    public static  Empregado filtraIdEmpregado(int id, List<Empregado> funcionarios) {
        Empregado empregado = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return empregado;
    }

}
