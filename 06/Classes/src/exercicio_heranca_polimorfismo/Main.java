package exercicio_heranca_polimorfismo;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de funcionarios: ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o nome do funcionario: ");
            sc.nextLine();
            String nameF = sc.nextLine();
            System.out.println("Entre com o as horas trabalhadas do funcionario: ");
            int hoursF = sc.nextInt();
            System.out.println("Entre com o valor da hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Esse funcionario é terceirizado? (Y/N)");
            char yn = sc.next().charAt(0);
            if (yn == 'Y'){
                System.out.println("Entre com o valor de cobrança adicional: ");
                double addicionalCharge = sc.nextDouble();
                Employee e = new OutsourcedEmployee(nameF, hoursF, valuePerHour, addicionalCharge);
                employees.add(e);
            }
            if (yn == 'N'){
                Employee e = new Employee(nameF, hoursF, valuePerHour);
                employees.add(e);
            }
        }
        for (Object obj :
                employees) {
            System.out.println(obj);
        }
    }
}
