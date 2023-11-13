package Desafio_plataforma_de_ensino;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas aulas tem o curso?");
        int n = sc.nextInt();
        List<Lesson> lessons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           System.out.println("Conteudo ou tarefa? (c/t)");
           char opcao = sc.next().charAt(0);
           sc.nextLine();
           if (opcao == 'c') {
               System.out.println("Entre com o titulo:");
               String titulo = sc.nextLine();
               System.out.println("Entre com o url do video");
               String url = sc.nextLine();
               System.out.println("Entre com a duracao em secundos:");
               int duracao = sc.nextInt();
               lessons.add(new Video(titulo, url, duracao));
           }
           if (opcao == 't') {
               System.out.println("Entre com o titulo:");
               String titulo = sc.nextLine();
               System.out.println("Entre com a descricao:");
               String descricao = sc.nextLine();
               System.out.println("Entre com a quantidade de quesões:");
               int quantidade = sc.nextInt();
               lessons.add(new Task(titulo, descricao, quantidade));
           }
        }
        sc.close();
        int sum = 0;
        for (Lesson obj :
                lessons) {
            sum += obj.duration();
            System.out.println("DURAÇÃO TOTAL DO CURSO:  " + sum);
        }
    }
}
