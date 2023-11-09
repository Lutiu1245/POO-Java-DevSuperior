package exercicio_taxPayer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero dos pagadore de taxas: ");
        int n = sc.nextInt();
        List<taxPayer> taxPayers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Individual ou compania? (i/c)");
            char opcao = sc.next().charAt(0);
            if (opcao == 'i') {
                sc.nextLine();
                System.out.println("Entre o nome do pagador: ");
                String nome = sc.nextLine();
                System.out.println("Entre com o pagamento anual:");
                double pagamento = sc.nextDouble();
                System.out.println("Possuiu despesas com saude? (s/n)");
                char opcao2 = sc.next().charAt(0);
                if (opcao2 == 's') {
                    System.out.println("Entre com o as despesas de saúde: ");
                    double medical = sc.nextDouble();
                    taxPayers.add(new Individual(nome, pagamento, medical));
                }
                if (opcao2 == 'n') {
                    taxPayers.add(new Individual(nome, pagamento));
                }
            }
            if (opcao == 'c') {
                sc.nextLine();
                System.out.println("Entre o nome da compania: ");
                String nome = sc.nextLine();
                System.out.println("Entre com o pagamento anual:");
                double pagamento = sc.nextDouble();
                System.out.println("Entre com o numero de funcionarios: ");
                int funcinarios = sc.nextInt();
                taxPayers.add(new Company(nome, pagamento, funcinarios));
            }
        }
        System.out.println("TAXES PAID:");
        for (Object obj :
                taxPayers) {
            System.out.println(obj);
        }

    }
}
