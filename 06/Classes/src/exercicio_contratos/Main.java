package exercicio_contratos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/yyyy");

        System.out.println("Entre com o nome do departamento: ");
        String nameDepartament = sc.nextLine();
        Department dp = new Department(nameDepartament);
        System.out.println("Entre com o nome do trabalhador: ");
        String name = sc.nextLine();
        System.out.println("Entre com o level dele: ");
        WorkLevel level = WorkLevel.valueOf(sc.nextLine());
        System.out.println("Entre com o salario base dele: ");
        double salario = sc.nextDouble();
        Worker worker = new Worker(name, level, salario, dp);
        System.out.println("Quantos contratos tem o trabalhador?");
        byte n = sc.nextByte();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com a data do contrato(DD/MM/YYYY)");
            sc.nextLine();
            Date dataContrato = dateFormat.parse(sc.nextLine());
            System.out.println("Entre com o valor da hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.println("Entre com a duração de horas: ");
            int horas = sc.nextInt();
            HourContract contrato =  new HourContract(dataContrato, valorPorHora, horas);
            worker.addContract(contrato);
        }
        System.out.print("Entre o mês e ano para calcular a renda(MM/YYYY): ");
        String dateMounthYear = sc.next();
        try {
            Date date = dateFormat1.parse(dateMounthYear);
            int mes = date.getMonth() + 1;
            int ano = date.getYear() + 1900;
            System.out.println("Nome: " + worker.getName());
            System.out.println("Departamento: " + worker.getDepartment().getName());
            System.out.println("Renda: " + worker.income(mes, ano));
        }catch (java.text.ParseException e) {
            System.out.println("Formato de data inválido. Use o formato MM/YYYY.");
        }
    }
}
